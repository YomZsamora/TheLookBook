package com.lookbook;
import com.lookbook.models.Work;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import static spark.debug.DebugScreen.enableDebugScreen;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.port;
import static spark.Spark.staticFileLocation;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
   static Logger logger = LoggerFactory.getLogger(App.class);

   public static List<Work> processResults(Response response) {
      List<Work> results = new ArrayList<>();
      // Books result = null;

      try {
         String xmlData = response.body().string();

         logger.info("jsonData: " + xmlData);
         if (response.isSuccessful()) {
            JSONObject responseJson = XML.toJSONObject(xmlData);
            JSONArray jsonArray = responseJson.getJSONObject("GoodreadsResponse")
                                               .getJSONObject("search")
                                               .getJSONObject("results")
                                               .getJSONArray("work");
            logger.info("converted: " + jsonArray);

            Type Work = new TypeToken<List<Work>>() {}.getType();
               Gson gson = new GsonBuilder().create();
               results = gson.fromJson(jsonArray.toString(), Work);                
            }
         } catch (JSONException | NullPointerException | IOException e) {
            e.printStackTrace();
         }
         return results;
      }

  	public static void main(String[] args) {
      OkHttpClient client = new OkHttpClient();

      ProcessBuilder process = new ProcessBuilder();
      Integer port;

      if (process.environment().get("PORT") != null) {
          port = Integer.parseInt(process.environment().get("PORT"));
      } else {
         port = 4567;
      }

      port(port);
      // enableDebugScreen();

      staticFileLocation("/public");
      String layout = "templates/layout.vtl";

      // get("/", (req, res) -> {
      //    Map<String, Object> model = new HashMap<>();
      //    model.put("template", "templates/index.vtl");
      //    return new VelocityTemplateEngine().render(new ModelAndView(model, layout));
      // });

      get("/", (req, res) -> {
         Map<String, Object> model = new HashMap<>();

         HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.BASE_URL).newBuilder();
         urlBuilder.addQueryParameter(Constants.API_PARAMETER,Constants.API);
         urlBuilder.addQueryParameter(Constants.QUERY_PARAMETER,Constants.QUERY);

         String url = urlBuilder.build().toString();
         logger.info("url is: " + url);

         Request request = new Request.Builder()
            .url(url)
            .build();

         try (Response response = client.newCall(request).execute()) {
            List<Work> result = processResults(response);
            if (result != null) {
               model.put("authors", result);
               logger.info("Request is: "+request);
            }
         } catch(IOException e) {
            e.getStackTrace();
         }

         model.put("template", "templates/index.vtl");
         return new VelocityTemplateEngine().render(new ModelAndView(model, layout));
      });
   }
}
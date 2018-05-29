package com.lookbook;
import com.lookbook.models.Books;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import static spark.debug.DebugScreen.enableDebugScreen;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.port;
import static spark.Spark.staticFileLocation;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
   public static Books processWeatherResults(Response response) {
      Books result = null;

      try {
         String jsonData = response.body().string();

         if (response.isSuccessful()) {
            JSONObject responseJson = new JSONObject(jsonData);

            Gson gson = new GsonBuilder().create();
            result = gson.fromJson(responseJson.toString(), Books.class);
         }
      } catch (JSONException | NullPointerException | IOException e) {
         e.printStackTrace();
      }

      return result;
   }

  	public static void main(String[] args) {
      OkHttpClient client = new OkHttpClient();

      ProcessBuilder process = new ProcessBuilder();
      Integer port;

      if (process.environment().get("PORT") != null) {
         port = Integer.parseInt(process.environment().get("PORT"));
      } 
      else {
         port = 4567;
      }

      port(port);
      enableDebugScreen();

      staticFileLocation("/public");
      String layout = "templates/layout.vtl";


      get("/", (req, res) -> {
         Map<String, Object> model = new HashMap<>();
         model.put("template", "templates/index.vtl");
         return new VelocityTemplateEngine().render(new ModelAndView(model, layout));
      });

      
   }
}
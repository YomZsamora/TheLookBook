jQuery(document).ready(function() {
    
   "use strict";

   $('#deleteClientAlert').hide();
   $('#updateClientForm').hide();
  
   jQuery('#toggleDeleteClient').click(function(){
      $('#deleteClientAlert').show();
      $('#updateClientForm').hide();
   });
   jQuery('#toggleBackDeleteClient').click(function(){
      $('#deleteClientAlert').hide();
   });

   jQuery('#toggleUpdateClient').click(function(){
      $('#updateClientForm').show();
      $('#deleteClientAlert').hide();
   });
   jQuery('#toggleBackUpdateClient').click(function(){
      $('#updateClientForm').hide();
   });

   $("form[name='updateStylist']").validate({
      rules: {
         stylistFirstName: "required",
         stylistLastName: "required",
         stylistAge: {
            required: true,
            number: true
         },
         stylistPhone: "required",
         stylistDept: "required"
      },

      messages: {
         stylistFirstName: "Please update stylist's first name.",
         stylistLastName: "Please update stylist's last name.",
         stylistAge: {
            required: "Please update stylist's age.",
            number: "Please enter a valid number."
         },
         stylistPhone: "Please update stylist's phone number.",
         stylistDept: "Please update stylist's department."
      },
      submitHandler: function(form) {
         form.submit();
      }
   });

   $("form[name='addStylist']").validate({
      rules: {
         stylistFirstName: "required",
         stylistLastName: "required",
         stylistAge: {
            required: true,
            number: true
         },
         stylistPhone: "required",
         stylistDept: "required"
      },

      messages: {
         stylistFirstName: "Stylist's first name is required.",
         stylistLastName: "Stylist's last name is required.",
         stylistAge: {
            required: "Stylist's age is required.",
            number: "Please enter a valid number."
         },
         stylistPhone: "Stylist's phone number is required.",
         stylistDept: "Stylist's department is required."
      },
      submitHandler: function(form) {
         form.submit();
      }
   });

   $("form[name='addClient']").validate({
      rules: {
         clientFirstName: "required",
         clientLastName: "required",
         clientPhoneNo: "required"
      },

      messages: {
         clientFirstName: "Client's first name is required.",
         clientLastName: "Client's last name is required.",
         clientPhoneNo: "Client's phone number is required."
      },
      submitHandler: function(form) {
         form.submit();
      }
   });

   $("form[name='updateClient']").validate({
      rules: {
         clientFirstName: "required",
         clientLastName: "required",
         clientPhoneNo: "required"
      },

      messages: {
         clientFirstName: "please update client's first name.",
         clientLastName: "please update client's last name.",
         clientPhoneNo: "please update client's phone number."
      },
      submitHandler: function(form) {
         form.submit();
      }
   });
});
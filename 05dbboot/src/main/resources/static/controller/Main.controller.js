sap.ui.define(
	  ["sap/ui/core/mvc/Controller",
	    "jquery.sap.global",
	    "leonardo/util/service",
	    "sap/m/MessageBox"],

      function(Controller, jQuery, service, MessageBox ){
	
	  return Controller.extend("leonardo.controller.Main",{
		
		onInit: function(){
			var oModel = new sap.ui.model.json.JSONModel();	
			        oModel.setData({
				      "postPayload":{
					
					         "companyName":"",
                             "firstname":"",
                             "lastName":"",
                             "website":"",
                             "email":"",
                             "status":"A",
                             "gstNo":"",
					
				},
				      "vendor":{}
				
			});
				     //set the model object to the entire App level
				    sap.ui.getCore().setModel(oModel);
			
		},
		onSave: function(){
			 var oModel  =  sap.ui.getCore().getModel();
			 var payload =  oModel.getProperty("/postPayload")
			 service.callService("/vendor", "POST", payload).then(function(){
				   MessageBox.confirm("Saved Succes");
				
			}).catch(function(){
				   MessageBox.error("post failed");
			});
		},
		
		
		onLoadData: function(){
			//alert("todo: we will call our microservice");
			var that = this;
			service.callService("/newVendor", "GET", {}).then(function(data){
				// get the object of the table		
				var oTable = that.getView().byId("idTable")	;
				//create a new ui5 model which contain the data
				var oModel = sap.ui.getCore().getModel();		
				    oModel.setProperty("/vendor", data._embedded.vendor);
					
				
				//set the model object to the entire App level
				
				//Bind aggregation of the table
					oTable.bindRows("/vendor");
				
				
			}).catch(function(oError){
				
				
			});
			
			
			
		}
	});
});
sap.ui.define(
	  ["jquery.sap.global"],

      function(jQuery){
	       return{
		    callService: function(surl, sMethod, oPayload){
			   return new Promise(function(resolve,reject){
			   
			     switch(sMethod.toUpperCase()){
				
				     case "GET":
				     jQuery.ajax(surl,{
				        type:'GET',
				          success: function(data){
				             resolve(data);
				          },
				error:function(err){
					 reject (err);
				}
			});   
				     
				             break;
				     case "POST":
				     
				     jQuery.ajax(surl,{
				        type:'POST',
				          contentType: 'application/json',
				          data:JSON.stringify(oPayload),
				          success: function(data){
				             resolve(data);
				          },
				       error:function(err){
					    reject (err);
				}
			});   
				     
				     
				     
				     
				             break;
			      }
			   
			 });
			
		}
		
	}
	
	}
);
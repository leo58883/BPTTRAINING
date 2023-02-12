package com.leonardo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.leonardo.service.VendorService;
import com.leonardo.entities.Vendor;

@RestController

public class VendorController {
	
	@Autowired
	VendorService VendorService;
	
	@RequestMapping("/vendor")
	public List<Vendor> getVendors(){
		return VendorService.readAllVendor();	
	}
	
//	{
	//	    "companyName":"SAP",
	//  "firstname":"Leo",
	//  "lastName":"Avila",
	//  "website":"leo.com",
	//  "email":"leo@hotmail.com",
	//  "status":"A",
	//  "gstNo":"GST12345",
	//  "addresses":[{
	//     "adressType":"H",
	//     "street":"MG Road",
	//     "city":"Bogota",
	//     "country":"Colombia",
	//     "region":"DC"
	//  }]

//	}
	@PostMapping("/vendor")
	public Vendor createVendor(@RequestBody Vendor myPostBody) {
		
		return VendorService.createVendor(myPostBody);
		
	}
	//http://localhost:8080/vendor/search?company=SAP
	@RequestMapping("/vendor/search")
	public List<Vendor> searchByCompany(@RequestParam String company){
		
		return VendorService.searchByCompanyName(company);
	}
	
	//http://localhost:8080/vendor/searchem?email=avila
	@RequestMapping("/vendor/searchem")
	public List<Vendor> searchEmail(@RequestParam String email){
		
		return VendorService.searchEmail(email);
	}
	
	//http://localhost:8080/vendor/Lookup?gst=44
	@RequestMapping("/vendor/lookup")
	public List<Vendor> lookupgst(@RequestParam String gst){
		
		return VendorService.lookupVendorByGST(gst);
	}
	
	//http://localhost:8080/vendor/lookupf?fir=na
	@RequestMapping("/vendor/lookupf")
	public List<Vendor> lookupfirst(@RequestParam String fir){
		
		return VendorService.Lookupf(fir);
	}
	
	
	
	// get single vendor
	@RequestMapping("/vendor/{vendorCode}")
	public Vendor getVendorById(@PathVariable("vendorCode") Long code) {
		    Optional<Vendor> searchResult = VendorService.getVendorById(code);
		    
		    if(!searchResult.isPresent()) {
		    		
		    	return new Vendor((long)0,"","","","","","",null);
		    }
		    return searchResult.get();
		    
		
	    }
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/vendor")
	
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		
			return VendorService.changeVendor(vendor);
		}
		
	
// service for delete vendor
@RequestMapping(method=RequestMethod.DELETE, value="/vendor/{id}")
  public String  delete(@PathVariable("id") Long ID) {
	return VendorService.deleteVendor(ID);
}
	

	

	
	

}

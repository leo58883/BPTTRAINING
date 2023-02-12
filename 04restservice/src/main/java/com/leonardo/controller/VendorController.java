package com.leonardo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.leonardo.service.VendorService;
import com.leonardo.entities.Vendor;

@RestController

public class VendorController {
	
	@Autowired
	VendorService VendorService;
	
	@RequestMapping("/vendor")
	public HashMap<String, Vendor> getVendors(){
		return VendorService.readAllVendor();	
	}
	
	
	@PostMapping("/vendor")
	public Vendor createVendor(@RequestBody Vendor myPostBody) {
		
		return VendorService.createVendor(myPostBody);
		
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/changeVendor")
	
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		
		return VendorService.ChangeVendor(vendor);
	}
	
	
	
	
	
	@RequestMapping("/vendor/{vendorCode}")
	public Vendor getVendorById(@PathVariable("vendorCode") String Code) {
	
		return VendorService.getSingleVendorById(Code);
		
	}
	

	
	

}

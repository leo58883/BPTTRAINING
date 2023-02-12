package com.leonardo.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leonardo.entities.Vendor;

@Component
public class VendorService {

	
HashMap <String, Vendor> vendors = new HashMap<String, Vendor>();
	
	@Autowired
	Vendor x;
	
	@Autowired
	Vendor y;
	
	@Autowired
	Vendor z;

	
public 	HashMap<String, Vendor> readAllVendor(){
	fillVendor();
  return vendors;
}
	
public Vendor getSingleVendorById(String vendorCode) {
	
	fillVendor();
	return (Vendor)vendors.get(vendorCode);
	
}

public Vendor ChangeVendor(Vendor vendor) {
	
	return vendor;
	
}

	
	private void fillVendor() {
		// TODO Auto-generated method stub
		
		vendors.put("1", x);
		vendors.put("2", y);
		vendors.put("3", z);
	}
	
	public Vendor createVendor(Vendor vendor ) {
		vendor.code = "NewwwwwwVendor";
		return vendor;
		
	}
	
	
}

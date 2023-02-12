package com.leonardo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leonardo.entities.Vendor;

@Component
public class VendorService {

	@Autowired
   IVendorPersistence vendor;
	
public 	List<Vendor> readAllVendor(){
	
  return vendor.findAll();
}
	



//public Vendor getSingleVendorById(String vendorCode) {
	
	
//	return (Vendor)vendors.get(vendorCode);
	
//}

//public Vendor ChangeVendor(Vendor vendor) {
	
//return vendor;
	
//}

	

	
	public Vendor createVendor(Vendor vendorObj ) {
		
		
		return vendor.save(vendorObj);
	}
	

	public List<Vendor> searchByCompanyName(String companyName){
		
		return vendor.findByCompanyName(companyName);
	}
	
	
  public List<Vendor> searchEmail(String aa){
	  return vendor.findByEmail(aa);
	  
  }	
  
  
  public List<Vendor> lookupVendorByGST(String gst){
	  
	    return vendor.lookupVendorByGST(gst); 
	  
  }
	
  
  public List<Vendor> Lookupf (String first){
	  
	  return vendor.Lookupfirst(first);
  }
  
  
  //  get single vendor
  public Optional<Vendor> getVendorById(Long id) {
	  
	  return vendor.findById(id);
  }
  
  //change vendor o update
  public Vendor changeVendor(Vendor payload) {
	  
	  Optional<Vendor> myVendor = vendor.findById(payload.getId());
	    
	  if(!myVendor.isPresent()) {
		  
		  return new Vendor((long)0,"","","","","","",null);
	  }
	  return vendor.save(payload);
  }
  
  // delete vendor
  
  public String deleteVendor(Long Id) {
	  
	   vendor.deleteById(Id);
	   
	   return "Delete succesfully";
  }
  
}

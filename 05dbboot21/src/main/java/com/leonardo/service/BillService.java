package com.leonardo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.leonardo.entities.*;
@Component

public class BillService {
	
	@Autowired
	IBillPersistence bbill;
	
	public List <Bill> readAllBill(){
		
		return bbill.findAll();
	}

	
public Bill createBill(Bill Objbill) {
	
	  return bbill.save(Objbill);
	
  }	

public List <Bill> findDocument(Long doc){
	
	return bbill.findBydocument(doc);
	
}


public List <Bill>  findSec(String Sec){
	
	return bbill.findBysector(Sec);
}


public List <Bill> looksec (String Sec){
	
	return bbill.lookupSector(Sec);
}


}

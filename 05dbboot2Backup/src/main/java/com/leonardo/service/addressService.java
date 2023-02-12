package com.leonardo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leonardo.entities.*;

@Component

public class addressService {
	
	@Autowired
	IAddresspersistence address;
	
	
	
	public List<adress> getAddress(){
		
		return address.findAll();
	}

	
	
	public adress createAddress(adress PayLoad) {
		
		return address.save(PayLoad);
		
	} 
	
	
}

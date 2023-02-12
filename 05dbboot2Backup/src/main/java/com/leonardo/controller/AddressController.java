package com.leonardo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.entities.adress;
import com.leonardo.service.addressService;

@RestController
public class AddressController {
	
	@Autowired
	addressService addSrv;
	
	//http://localhost:8080/addresses
	@RequestMapping("/addresses")
        public List<adress> getAddress(){
		
		return addSrv.getAddress();
	}
	
	//{      
        //   "adressType": "address1",
        //     "street": "address1",
        //     "city": "address1",
        //     "country": "Colombia",
        //      "region": "Cundi"
        // }
	@PostMapping("/addresses")
        public adress createAddress(@RequestBody  adress PayLoad) {
		
		return addSrv.createAddress(PayLoad);
		
	} 
	

}

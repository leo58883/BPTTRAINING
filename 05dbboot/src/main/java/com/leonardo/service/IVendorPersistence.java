package com.leonardo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.leonardo.entities.*;
public interface IVendorPersistence extends JpaRepository<Vendor, Long> {

	List <Vendor> findByCompanyName(String companyName);
	List <Vendor> findByEmail(String ab);
	
	@Query(nativeQuery=true, 
			value="SELECT * FROM public.vendor where lower(GST_NO) like %?1%")
	List <Vendor> lookupVendorByGST(String GSTNo);
	
	
	@Query(nativeQuery=true,
			 value="Select * from public.vendor where lower(first_name) like %?1%")
	    List <Vendor> Lookupfirst (String first);
}

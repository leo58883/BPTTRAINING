package com.leonardo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import com.leonardo.entities.Bill;


@SuppressWarnings("unused")
public interface IBillPersistence extends JpaRepository<Bill, Long>  {
	
 List <Bill> findBydocument(Long document);
 
 List <Bill> findBysector(String sec);
 
 
 @Query(nativeQuery=true,
		 value="SELECT * FROM public.bill where lower(sector) like %?1%")
         List <Bill> lookupSector(String sec);
 

 
}

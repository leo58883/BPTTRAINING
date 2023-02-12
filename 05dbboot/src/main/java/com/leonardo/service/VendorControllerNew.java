package com.leonardo.service;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.leonardo.entities.*;

@RepositoryRestResource
   (collectionResourceRel  ="vendor", path="newVendor")

public interface VendorControllerNew extends JpaRepository<Vendor, Long>{
	

}

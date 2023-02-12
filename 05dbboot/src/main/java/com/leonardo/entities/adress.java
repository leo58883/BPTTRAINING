package com.leonardo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
 
public class adress {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, name="ID")
	private Long    adressId;
	@Column(name="TYPE")
	private String  adressType;
	@Column(nullable=false, name="STREET")
	private String  street;
	@Column(nullable=false, name="CITY")
	private String  city;
	@Column(nullable=false, name="COUNTRY")
	private String  country;
	@Column(nullable=false, name="REGION")
	private String region;
	

	
	
	
	
	
	
	
	public adress(Long adressId, String adressType, String street, String city, String country, String region) {
		super();
		this.adressId = adressId;
		this.adressType = adressType;
		this.street = street;
		this.city = city;
		this.country = country;
		this.region = region;
	}
	

	public adress() {
		
		
	}
	
	
	
	public Long getAdressId() {
		return adressId;
	}
	public void setAdressId(Long adressId) {
		this.adressId = adressId;
	}
	public String getAdressType() {
		return adressType;
	}
	public void setAdressType(String adressType) {
		this.adressType = adressType;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
	
}

package com.leonardo.entities;

import java.sql.Date;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="Vendor")

public class Vendor {
	
	@Id
	@Column(nullable=false, name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long Id;
	@Column(nullable=false, name="COMPANY_NAME")
	public String companyName;
	@Column(nullable=false, name="FIRST_NAME")
	public String firstname;
	@Column(nullable=false, name="LASTNAME")
	public String lastName;
	@Column(nullable=false, name="WEBSITE")
	public String website;
	@Column(nullable=false, name="EMAILID")
	public String email;
	@Column(nullable=false, name="STATUS")
	public String status;
	@Column(nullable=false, name="GST_NO")
	public String gstNo;
	
	
	
	public Vendor() {
		
		
	}
	
	
	
	
	public Vendor(Long id, String companyName, String firstname, String lastName, String website, String email,
			String status, String gstNo) {
		super();
		Id = id;
		this.companyName = companyName;
		this.firstname = firstname;
		this.lastName = lastName;
		this.website = website;
		this.email = email;
		this.status = status;
		this.gstNo = gstNo;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	
	
	
	
	
	
	
	
	

}

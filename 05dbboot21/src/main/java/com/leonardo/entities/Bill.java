package com.leonardo.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="Bill")

public class Bill {

	@jakarta.persistence.Id
	@Column(nullable=false, name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long Id;
	
	@Column(nullable=false, name="Document")
	public Long document;
	
	@Column(nullable=false, name="Sector")
	public String sector;
	
	
	public Bill() {
		
		
	}

	public Bill(Long id, Long document, String sector) {
		super();
		Id = id;
		this.document = document;
		this.sector = sector;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getDocument() {
		return document;
	}

	public void setDocument(Long document) {
		this.document = document;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	
	
	
	
}

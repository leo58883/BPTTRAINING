package com.leonardo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.entities.adress;

public interface IAddresspersistence extends JpaRepository<adress, Long>{

}

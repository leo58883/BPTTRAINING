package com.leonardo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.leonardo.myclasses.Laptop;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		
ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	Laptop appleI80 = context.getBean(Laptop.class);
	
	Laptop samsung = context.getBean(Laptop.class);
	
	appleI80.setBrandName("Lenovo");
	samsung.setBrandName("Samsung");
	
	System.out.println(appleI80.toString());
	System.out.println(samsung.toString());
	}

}

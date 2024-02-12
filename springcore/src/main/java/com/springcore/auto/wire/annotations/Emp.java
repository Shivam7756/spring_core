package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// Autowired can be used in three ways
// writing it on property , or on setter method , or constructor method
//Qualifier annotation used to select which type of bean you want to use and inject its object

public class Emp {
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting values");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	//@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Constructor Method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address="+address+"]";
	}
	
	

}

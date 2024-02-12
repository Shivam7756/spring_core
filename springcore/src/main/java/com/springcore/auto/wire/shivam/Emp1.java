package com.springcore.auto.wire.shivam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// Autowired can be used in three ways
// writing it on property , or on setter method , or constructor method
//Qualifier annotation used to select which type of bean you want to use and inject its object

public class Emp1 {
	@Autowired
	@Qualifier("address2")
	private Address1 address;

	public Address1 getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address1")
	public void setAddress(Address1 address) {
		System.out.println("Setting values");
		this.address = address;
	}

	public Emp1() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	//@Autowired
	public Emp1(Address1 address) {
		super();
		System.out.println("Constructor Method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp1 [address="+address+"]";
	}
	
	

}

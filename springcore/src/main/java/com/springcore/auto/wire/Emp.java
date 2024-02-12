package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Emp(Address address) {
		super();
		System.out.println("constructor method");	
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp1 [address="+address+"]";
	}
	
	

}

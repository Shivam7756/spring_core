package com.springcore.practice.shivam;

public class base {
	private String name;
	private int id;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "base [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	public base(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public base() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

package com.springcore.practice.shivam;

public class xml {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "xml [price=" + price + "]";
	}

	public xml() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init()
	{
		System.out.println("Initializing method");
	}

	public void destroy()
	{
		System.out.println("Destroy method");
	}
}

package com.springcore.lifecycle;

public class S1 {
    private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public S1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "S1 [price=" + price + "]";
	}
    
	public void init()
	{
		System.out.println("Inside Init method");
		
	}
	
	public void Destroy()
	{
		System.out.println("Call when to destroy");
	}
}

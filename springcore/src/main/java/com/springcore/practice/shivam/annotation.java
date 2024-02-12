package com.springcore.practice.shivam;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class annotation {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "annotation [price=" + price + "]";
	}

	public annotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("PostConstruct Method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("PreDestroy Method");
	}
	

}


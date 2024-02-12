package com.springcore.practice.shivam;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class beans implements InitializingBean,DisposableBean{
	private double price;

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ending method");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting method");
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "beans [price=" + price + "]";
	}
 
	
}

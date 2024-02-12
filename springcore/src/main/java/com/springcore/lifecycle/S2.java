package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class S2 implements InitializingBean,DisposableBean {//used interface for implementing init and destroy methods(Initializing bean and disposable bean)
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public S2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "S2 [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing the code");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cleanup the code");
	}
	

}

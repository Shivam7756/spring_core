package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/s1.xml");
		context.registerShutdownHook();
		S1 s1 = (S1)context.getBean("s1");
		S2 s2 = (S2)context.getBean("s2");
		System.out.println(s1);
		System.out.println(s2);
		//needed for calling destroy method,part of abstractapplicationcontext class
		System.out.println("/********/");
		S3 s3 = (S3)context.getBean("s3");
		System.out.println(s3);

	}

}

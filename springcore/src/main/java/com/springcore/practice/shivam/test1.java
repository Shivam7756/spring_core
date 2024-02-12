package com.springcore.practice.shivam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practice/shivam/Base.xml");
		base b = (base)context.getBean("base");
		System.out.println(b);
	}
}
package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alone.xml");
		Person p1 = (Person) context.getBean("person1");
		Person p2 = (Person) context.getBean("person2");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.getFriends().getClass());
		System.out.println(p2.getFees().getClass().getName());
		System.out.println(p2.getProperties());

	}


}

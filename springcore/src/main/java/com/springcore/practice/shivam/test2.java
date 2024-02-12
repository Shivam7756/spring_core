package com.springcore.practice.shivam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/practice/shivam/base2.xml");
		 A a = (A)context.getBean("one");
		 B b = (B)context.getBean("two");
		 B c = (B)context.getBean("three");
		 AbstractApplicationContext c1 = new ClassPathXmlApplicationContext("com/springcore/practice/shivam/lifecycle.xml");
		 xml x = (xml)c1.getBean("xml");
		 beans x1 = (beans)c1.getBean("s3");
		 annotation a1 = (annotation)c1.getBean("s4");
		 c1.registerShutdownHook();
		 System.out.println(a);
		 System.out.println(c);
		 System.out.println(b);
		 System.out.println(x);
		 System.out.println(x1);
		 System.out.println(a1);
	}

}

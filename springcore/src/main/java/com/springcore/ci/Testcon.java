package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcon {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/ci/coin.xml");
		Person a = (Person)context.getBean("person");
		System.out.println(a);

		Addition add = (Addition)context.getBean("add");
		add.dosum();
		System.out.println(add);
	}

}

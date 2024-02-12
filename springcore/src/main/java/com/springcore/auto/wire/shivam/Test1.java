package com.springcore.auto.wire.shivam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/shivam/auto1.xml");
         Emp1 e1 = context.getBean("emp1",Emp1.class);
         System.out.println(e1);
	}

}

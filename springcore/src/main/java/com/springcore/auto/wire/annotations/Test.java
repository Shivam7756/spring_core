package com.springcore.auto.wire.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotations/Auto.xml");
         Emp emp1 =  context.getBean("emp1",Emp.class);
         System.out.println(emp1);
	}

}

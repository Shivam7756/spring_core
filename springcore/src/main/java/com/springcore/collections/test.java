package com.springcore.collections;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/config2.xml");
		Emp emp1 = (Emp)context.getBean("emp1");
		Emp emp2 = (Emp)context.getBean("emp2");
		Emp emp3 = (Emp)context.getBean("emp3");
		System.out.println(emp1.getEmpName() + " , " + emp1.getAddress() + " , " + emp1.getPhoneNo() + ", " + emp1.getCourses() + " , " + emp1.getProps() + " " );
		System.out.println(emp2.getEmpName() + " , " + emp2.getAddress() + " , " + emp2.getPhoneNo() + ", " + emp2.getCourses() + " , " + emp2.getProps() + " " );
		System.out.println(emp3.getEmpName() + " , " + emp3.getAddress() + " , " + emp3.getPhoneNo() + ", " + emp3.getCourses() + " , " + emp3.getProps() + " " );
	    System.out.println(emp1.getPhoneNo().getClass().getName());
	}

}

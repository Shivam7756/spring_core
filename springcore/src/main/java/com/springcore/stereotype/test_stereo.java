package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_stereo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/Stereo.xml");
       Student student = context.getBean("ob",Student.class);
       Student student1 = context.getBean("ob",Student.class);
       System.out.println(student);
       System.out.println(student.getAddress());
       System.out.println(student.getAddress().getClass().getName());
       System.out.println(student.getCourses().getClass().getName());
       System.out.println(student.hashCode());
       System.out.println(student1.hashCode());
	}

}

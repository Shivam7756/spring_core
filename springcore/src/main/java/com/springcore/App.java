package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;   

/**
 * Hello world!
 *
 */
public class App 
{    
        public static void main(String [] args)
        {
        	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");//uses IOC container to inject objects
        	student student1 = (student)context.getBean("student1");
        	student student2 = (student)context.getBean("student2");
        	student student3 = (student)context.getBean("student3");
        	
        	System.out.println(student1);
        	System.out.println(student2);
        	System.out.println(student3);
        }
}

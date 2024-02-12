package com.springcore.ref;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testref {
            public static void main(String[] args)
            {
            	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/config3.xml");
            	A a1 = (A)context.getBean("aref");
                B b1 = (B)context.getBean("bref");
                System.out.println(a1.getX());
                System.out.println(a1.getOb().getY());
                System.out.println(a1);
            }
}

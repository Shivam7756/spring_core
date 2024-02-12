package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/demo.xml");
		Demo demo = context.getBean("demo",Demo.class);
		System.out.println(demo);

		 SpelExpressionParser temp = new SpelExpressionParser();
		 SpelExpression expression = temp.parseRaw("22+44");
		 System.out.println(expression.getValue());
		 
	}

}

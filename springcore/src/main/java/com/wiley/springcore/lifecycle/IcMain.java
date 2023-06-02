package com.wiley.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context= 
    			new ClassPathXmlApplicationContext("com/wiley/springcore/lifecycle/configlife.xml");
		
		Pizza p= (Pizza) context.getBean("pizza1");
		
		System.out.println(p);
		
		context.registerShutdownHook();

	}

}

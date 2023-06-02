package com.wiley.springcore.misc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AwMain {
	public static void main(String[] args) {
		ApplicationContext context= 
    			new ClassPathXmlApplicationContext("com/wiley/springcore/misc/configmisc.xml");
		
		Employee p=   context.getBean("emp1",Employee.class);
		
		System.out.println(p);
		p.displayEmployee();
		
		System.out.println("-------------------------");
		
		SingleTonA objA= context.getBean("riti",SingleTonA.class);
		objA.sayHello();
		
	}

}

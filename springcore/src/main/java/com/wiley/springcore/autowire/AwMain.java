package com.wiley.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.ci.Person;

public class AwMain {
	public static void main(String[] args) {
		ApplicationContext context= 
    			new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/configautowire.xml");
		
		Emp p=  (Emp) context.getBean("emp1");
		
		System.out.println(p);
	}

}

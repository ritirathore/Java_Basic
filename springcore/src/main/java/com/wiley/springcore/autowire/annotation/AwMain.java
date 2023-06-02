package com.wiley.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.ci.Person;

public class AwMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/configannotation.xml");
		Emp p = context.getBean("emp1", Emp.class);
		//System.out.println(p);
		System.out.println(p.getAddress());
		System.out.println(p.getPhones());
		System.out.println(p.getCourse());


	}

}

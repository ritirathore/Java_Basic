package com.wiley.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CompMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/wiley/springcore/stereotype/configstereotype.xml");
		
		Student stu= context.getBean("student", Student.class);
		
		System.out.println(stu);
		

	}

}

package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context= 
    			new ClassPathXmlApplicationContext("config.xml");
    	
    	Student wst1= (Student)context.getBean("wileystudent1");
    	System.out.println(wst1.getStudentAddress());
    	
    	Student wst2= (Student)context.getBean("wileystudent2");
    	
    	System.out.println(wst1.toString());
    	System.out.println(wst2);
    	Student wst3= (Student)context.getBean("wileystudent3");
    	System.out.println(wst3);
    	
    	
    }
}

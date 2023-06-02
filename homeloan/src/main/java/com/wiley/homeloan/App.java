package com.wiley.homeloan;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	  Scanner sc= new Scanner(System.in);
    	  int i;
    	  System.out.println("Select 1 to loan application");
    	  i= sc.nextInt();
    	  if(i==1) {
    		  Loan l= new Loan();
    		  System.out.println("enter your details:");
    		  System.out.println("amount:");
    		  int amount= sc.nextInt();
    		  sc.nextLine();
    		  System.out.println("duration:");
    		  int duration= sc.nextInt();
    		  System.out.println("annual income:");
    		  int annual_income= sc.nextInt();
    	  }
    }
}

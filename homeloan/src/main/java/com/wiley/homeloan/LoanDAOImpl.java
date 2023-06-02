package com.wiley.homeloan;

import java.util.Scanner;

public class LoanDAOImpl implements LoanDAO{

	public void applyforLoan(User u) {
		// TODO Auto-generated method stub
		
		
	}

	public float calculateInterest(int duration, int amount) {
		// TODO Auto-generated method stub
		return 12;
//		return 0;
	}

	public int selectDuration() {
		// TODO Auto-generated method stub
		System.out.println("select your duration ");
		System.out.println("press 1 for 15 years");

		System.out.println("press 2 for 20 years");
		System.out.println("press 3 for 25 years");
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int d=0;
		if(n==1) {
			d=15;
		}
		else if(n==2) {
			d=20;
		}else {
			d=25;
		}
		return d;
	}

	public void showStatus(int user_id) {
		// TODO Auto-generated method stub
		String res;
		
		
	}
	
	

}

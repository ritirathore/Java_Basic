package com.wiley.homeloan;

public interface LoanDAO {
	
	
	public void applyforLoan(User u );
	public float calculateInterest(int duration, int amount);
	public int selectDuration();
	public void showStatus(int user_id);
	

}

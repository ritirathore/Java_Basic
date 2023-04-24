package wiley_core_java;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}else {
			System.out.println("insufficient funds");
		}
	}
	

}

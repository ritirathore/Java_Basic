package wiley_core_java;

interface Bank{
	void account();
}

interface Bank1{
	void account();
}

interface ATM extends Bank, Bank1{
	void insertCard();
	void selectOption();
	void enterPassword();
}

interface AA{
	void m1();
}

abstract class newATM implements ATM, AA{

	@Override
	public void account() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	
	
}

public class InterfaceBank extends newATM {
	
	public void insertCard() {
		System.out.println("Insert Card");
	}
	public void selectOption() {
		System.out.println("Select option");
	}
	public void enterPassword() {
		System.out.println("enter password");
	}
	
	public static void main(String[] args) {
		
	}

}

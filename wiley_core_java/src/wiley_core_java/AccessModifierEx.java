package wiley_core_java;

import new_package.ProtectedEx;

class Testr{
	private String name;
	public int x;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void print() {
		System.out.println("default message");
	}
	protected void display() {
		System.out.println("Protected display");
	}
}

public class AccessModifierEx extends Testr{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testr t= new Testr();
		t.print();
		
		t.setName("Riti");
		System.out.println(t.getName());
		t.display();
		
		t.x=20;
		System.out.println(t.x);
		
//		ProtectedEx pe= new ProtectedEx();
//		System.out.println(pe.str);

	}

}

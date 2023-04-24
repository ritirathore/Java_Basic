package wiley_core_java;

public class ConstructorTypes {
	
	public ConstructorTypes() {
		System.out.println("0 args constructor");
	}
	
	public ConstructorTypes(int a,int b) {
		System.out.println("2 args constructor:"+(a+b));
	}
	
	public ConstructorTypes(float a,int b) {
		this(2,7);
		System.out.println("2 args constructor:"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTypes ct= new ConstructorTypes();
		ConstructorTypes ct1= new ConstructorTypes(2.5f,3);
		

	}

}

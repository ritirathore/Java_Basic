package wiley_core_java;

class A{
	public void show(int a) {
		System.out.println("this is "+a );
	}
	
	public void show(int a,int b) {
		System.out.println("this is "+a );
		System.out.println("this is "+b );
	}
	

}


public class CompilePoly {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj= new A();
		obj.show(1);
		obj.show(2,3);

	}

}

package wiley_core_java;

abstract class Test1{
	{
		System.out.println("test1 instance block");
	}
	static {
		System.out.println("test1 static block");
	}
	public abstract void m1();
	
	public void m2() {
		System.out.println("test1 m2 method");
	}
	public static void main(String[] args) {
		System.out.println("this is test1 main method from abstract class");
	}
	public Test1() {
		System.out.println("test1 constructor");
	}
}

class Test2 extends Test1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("test2 m1 method");
	}
	
	public Test2() {
		System.out.println("test2 constructor");
	}
	static {
		System.out.println("test2 static block");
	}
}

public class AbstractionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2= new Test2();
		Test2 t3= new Test2();
		t2.m1();
		t2.m2();
		
		Test1.main(args);
		

	}

}

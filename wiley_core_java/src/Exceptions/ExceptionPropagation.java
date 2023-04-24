package Exceptions;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}catch(Exception e) {
			System.out.println("Exception caught: "+e.getMessage());
		}

	}
	
	public static void method1() throws Exception{
		method2();
		
	}

	private static void method2() throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("Exception occured in method2");
	}

}

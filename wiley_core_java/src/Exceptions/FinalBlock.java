package Exceptions;

public class FinalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("1111");
			System.out.println("wiley");
			System.out.println(10/0);
			
//			try {
//				System.out.println(10/0);
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}finally {
//				System.out.println("nested close connection");
//			}
			
//			System.exit(0);
			System.out.println("edge");
		}catch(Exception e){
			System.out.println("catch block");
			try {
				System.out.println("try inside catch");
				System.out.println(10/0);
			}catch(Exception e1) {
				e1.printStackTrace();
			}finally {
				System.out.println("nested catch 2");
			}
//			System.exit(0);
//			System.out.println(10/0);
			e.printStackTrace();
		}
		finally {
//			System.out.println(10/0);
		    System.out.println("close connection");
		}
		
		
		System.out.println("last message");

	}

}

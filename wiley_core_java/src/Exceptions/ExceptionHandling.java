package Exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First line");
		
		int arr[]= {1,2,3,4};
//		System.out.println(arr[4]);
		try {
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			
			System.out.println("simple ");
			
			String str="Wiley";
			System.out.println(str.charAt(2));
			
			System.out.println(12/0);
			
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
//			System.out.println("array out of bounds exception");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("catch block 2");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("catch block 3");
			e.printStackTrace();
		}
		
		System.out.println("second line");

	}

}

package Exceptions;

import java.util.ArrayList;

class StringNotFound extends RuntimeException{
	public StringNotFound(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
//		return super.getMessage();
		return "My message";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "my message 2";
	}
}

public class Unchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students= new ArrayList<>();
		students.add("Riti");
		students.add("Rathore");
		students.add("Me");
		
		if(!students.contains("iiti")) {
			try {
				throw new StringNotFound("This string is not found");
			}catch(StringNotFound e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
			}
		}
		System.out.println("message one");
		System.out.println("message two");
	}

}

package StringClasses;

import java.util.Arrays;
import java.util.List;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title= "Java Developer";
		float salary= 2000.39f;
		System.out.format("%s has %.2f USD salary",title,salary);
		System.out.println();
		
		List<String> techStack = Arrays.asList(
				                    "Essential Java",
				                    "Head First Java",
				                    "Java Design Patterns"
				                     );
		for(String book: techStack) {
			System.out.format("%-40s - In Stock%n", book);
		}

	}

}

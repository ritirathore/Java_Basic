package StringClasses;

import java.util.StringTokenizer;

public class StringTokenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input= "We , love , java , programming";
		StringTokenizer st= new StringTokenizer(input,",");
		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken().trim());
		}
//		System.out.println(st.nextToken());

	}

}

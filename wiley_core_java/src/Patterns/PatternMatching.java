package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Riti Rathore IS my name";
		Pattern pattern= Pattern.compile("is",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		
//		System.out.println(matcher);
		
//		System.out.println((matcher.find()));
		
		if(matcher.find()) {
			int start= matcher.start();
			int end= matcher.end();
			
			System.out.println("Start:"+start);
			System.out.println("End:"+end);
		}
		
		String pat= "is";
		int index= input.indexOf(pat);
		if(index!=-1)
			System.out.println(index);
		
		
		

	}

}

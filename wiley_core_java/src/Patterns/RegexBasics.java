package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String re= "..";
//		String re="\\w\\w\\w\\W.";
//		String re="\\S\\s";
		String re="\\d\\d\\D";
		String text="99a";
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(text);
		
		boolean res= matcher.matches();
		System.out.println(res);

	}

}

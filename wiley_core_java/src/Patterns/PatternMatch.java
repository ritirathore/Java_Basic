package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("^[a|A]gent (\\d{3,4})$");
		Matcher matcher = pattern.matcher("agent 0007");
		
//		boolean found= matcher.find();
//		boolean match= matcher.matches();
//		
		if(matcher.find()) {
			System.out.println("Group:"+matcher.group());
			System.out.println("Group:"+matcher.group(1));
		}
		
//		System.out.println("Found:"+found);
//		System.out.println("Match:"+match);

	}

}

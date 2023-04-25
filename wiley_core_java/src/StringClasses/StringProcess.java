package StringClasses;

public class StringProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Riti";
		String s2= "Riti";
		
		String s3= new String("Riti");
		String s4= new String("Riti");
		
		String str= "I am a Java Developer ";
		String str1= "Python Developer";
		
		System.out.println(str.charAt(10));
		System.out.println(str.length());
		
		String str2= str.concat(str1);
		System.out.println(str2);
		System.out.println(str.replace('D', 'd'));
		String str3[]= str.split("");
//		System.out.println(str3);
		for(String s:str3)
			System.out.println(s);
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s3==s4);
		
		String f1= "A";
		String f2= "b";
		String f3= "c";
		
		String f4= f1.concat(f2).concat(f3);
		System.out.println(f4);
		
		String st= " mobile ";
		System.out.println(st);
		System.out.println(st.trim()); // to remove end and beginning spaces
		
		System.out.println(str.substring(0,4));
		System.out.println(str.toUpperCase());

	}

}

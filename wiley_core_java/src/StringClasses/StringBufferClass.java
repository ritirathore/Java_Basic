package StringClasses;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("Riti");
		StringBuffer sb1= new StringBuffer("Riti");
		StringBuffer sb2= new StringBuffer("Riti");
		
		String s="Riti";
		
		System.out.println(s.equals(sb));
		System.out.println(s.equals(sb.toString()));
		
		System.out.println(sb);
		
		System.out.println(sb.equals(sb1));
		
		sb.append(" Rathore");
		System.out.println(sb);
		
		sb.insert(4, "J");
		System.out.println(sb);
		
		sb.insert(5, " kkkk");
		System.out.println(sb);
		
		System.out.println(sb.delete(4, 10));
		System.out.println(sb.reverse());

	}

}

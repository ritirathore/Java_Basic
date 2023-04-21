package wiley_core_java;

class Test{
	public static int add(int v1,int v2) {
		int val = v1+v2;
//		System.out.println("add in instance method:"+val);
		return val;
		
	}
}

public class MethodType {
	
	public void add(int v1,int v2) {
		int val = v1+v2;
		System.out.println("add in instance method:"+val);
		this.sub(9, 5);
		
	}
	
	public void sub(int v1,int v2) {
		int val = v1-v2;
		System.out.println("sub in instance method:"+val);
		
	}
	
	public static int mul(int v1,int v2) {
		int val = v1*v2;
//		System.out.println("mul in static method:"+val);
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= mul(2,3);
		System.out.println(x);
		MethodType mt= new MethodType();
		
		mt.add(2,3);
		
		System.out.println("from test:"+Test.add(10, 20));

	}

}

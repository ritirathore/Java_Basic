package wiley_core_java;

public class VarScope {
	
	int ins=20;
	int val=25;
	int val1= 12;
	static String name= "riti";
	
	public void sum() {
		int val=10;
		int val1=18;
		System.out.println("sum method:"+ (this.val+ this.val1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loc=10;
		int val= 25;
		
//		System.out.println("val:"+ this.val);
		
		VarScope vs= new VarScope();
		
		System.out.println("Local var:"+ loc);
		
		System.out.println("instance var:"+vs.ins);
		
		System.out.println("static var:"+ name);

		vs.sum();
	}

}

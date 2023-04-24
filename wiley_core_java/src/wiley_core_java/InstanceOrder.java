package wiley_core_java;

public class InstanceOrder {
	String name;
	int age;
	
	{
		name="riti";
		age= 22;
		System.out.println("Instance Block");
	}
	public InstanceOrder() {
		System.out.println("name :"+name +"age: "+ age);
		System.out.println("Constructor block");
		
	}
	public InstanceOrder(int a,int b) {
		System.out.println("Constructor param:"+(a+b));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceOrder io= new InstanceOrder();
		new InstanceOrder(2,3);

	}

}

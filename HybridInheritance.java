package wiley_core_java;

class Game{
	public void run() {
		System.out.println("run");
	}
}
interface cricket{
	public void six() ;
}
interface hockey{
	public void goal() ;
}

class Child extends Game implements cricket,hockey{
	public void six() {
		System.out.println("six");
	}
	public void goal() {
		System.out.println("goal");
	}
	public void show() {
		System.out.println("inside child");
	}
	
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c= new Child();
		c.show();
		c.six();
		c.goal();

	}

}

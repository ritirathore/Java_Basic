package wiley_core_java;

class Animal{
	public void eat() {
		System.out.println("Eat");
	}
	public void sleep() {
		System.out.println("sleep");
	}
	
}

class Lion extends Animal{
	public void roar() {
		System.out.println("roar");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l= new Lion();
		l.roar();
		l.sleep();
		l.eat();

	}

}

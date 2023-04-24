package wiley_core_java;

class Vehicle2{
	public void speed() {
		System.out.println(" speed");
	}
}

class Car2 extends Vehicle2{
	public void speed() {
		System.out.println("car speed");
	}
}

public class RuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 v= new Car2();
		v.speed();
		

	}

}

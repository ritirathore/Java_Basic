package wiley_core_java;

class Vehicle{
	public void tier() {
		System.out.println("tier");
	}
	public void steering() {
		System.out.println("steering");
	}

}

class Car extends Vehicle{
	public void airbag() {
		System.out.println("airbag");
	}
}

class SmartCar extends Car{
	public void sensor() {
		System.out.println("sensor");
	}
}


public interface MultilevelInheritance {
	
	public static void main(String[] args) {
		SmartCar sc= new SmartCar();
		sc.sensor();
		sc.steering();
		sc.airbag();
		sc.tier();
	}

	

}

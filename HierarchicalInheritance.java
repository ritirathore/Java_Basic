package wiley_core_java;

class Vehicle1{
	
	public void steering() {
		System.out.println("steering");
	}

}

class Car1 extends Vehicle1{
	public void airbag() {
		System.out.println("airbag");
	}
}

class Truck extends Vehicle1{
	public void Pump() {
		System.out.println("Pump");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
//		HierarchicalInheritance hi= new HierarchicalInheritance();
		Truck t= new Truck();
		t.steering();
		t.Pump();
		
		Car1 c= new Car1();
		c.airbag();
		c.steering();
	}

}

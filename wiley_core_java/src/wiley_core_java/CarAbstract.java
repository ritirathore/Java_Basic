package wiley_core_java;

abstract class Vehicler{
	protected String color;
	protected int speed;
	protected int numWheels;
	
	public Vehicler(String color, int speed, int numWheels) {
		this.color= color;
		this.speed= speed;
		this.numWheels= numWheels;
	}
	
	public abstract void move();
}

class Carr extends Vehicler{
	public void move() {
		
	}
	public Carr(String color, int speed, int numWheels) {
		super(color, speed, numWheels);
	}
	public void turn() {
		System.out.println("turn left or right");
	}
}

public class CarAbstract {

}

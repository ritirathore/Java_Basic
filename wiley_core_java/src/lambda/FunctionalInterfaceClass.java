package lambda;

@FunctionalInterface
interface Calc{
	int calculate(int val);
	default int add(int a,int b) {
		return a+b;
	}
}

public class FunctionalInterfaceClass {
	public static void main(String[] args) {
		Calc c= (int val)->val+54;
		System.out.println("Result:"+ c.calculate(54));
	}

}

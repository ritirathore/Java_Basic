package lambda;

public class LambdaClass {
	
	static String printThing(Printable thing) {
		return thing.print("!!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Product prod= new Product();
//		prod.print();
		
//		printThing(prod);
		
//		Printable p= () -> System.out.println("lambda exp");
		Printable p= s -> {return "wiley"+s;};
		
//		Printable p= (s1,s2) -> System.out.println(s1+"lambda exp"+ s2);
		
//		printThing(
//				 (s) -> { System.out.println("lambda exp"+s);	}
//				);
//		printThing(p);
//		System.out.println(p);
		System.out.println(printThing(p));

	}

}

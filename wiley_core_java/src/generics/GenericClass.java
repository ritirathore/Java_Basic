package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IntegerPrinter printer = new IntegerPrinter(27);
//		printer.print();
//		
//		DoublePrinter printer1 = new DoublePrinter(27.99);
//		printer1.print();
//		
//		StringPrinter printer2 = new StringPrinter("Hi");
//		printer2.print();
		
//		Printer<String> printer3= new Printer("hello");
//		printer3.print();
//		
//		Printer<Integer> printer4= new Printer(1234);
//		printer4.print();
//		
//		Printer<Double> printer5= new Printer(1234.23d);
//		printer5.print();
//		
//		Printer<Cat> printer6= new Printer(new Cat());
//		printer6.print();
//		
//		Printer<Dog> printer7= new Printer(new Dog());
//		printer7.print();
//		
//		ArrayList<Object> cats= new ArrayList<>();
//		cats.add(new Cat());
//		cats.add(new Cat());
//		cats.add(new Dog());
		
//		shout("Take me to movie");
//		shout("Bring necklace");
///		shout("Amount", 20000000);
//		shout(new Dog(),);
		List<Integer> intList= new ArrayList<>();
		intList.add(2);
		intList.add(5);
		printList(intList);
		
		List<Cat> catList= new ArrayList<>();
		catList.add(new Cat());
//		catList.add();
		printList(catList);
		

	}
	
	public static void printList(List<?> catList) {
		System.out.println(catList);
	}
	
	public static<T,V> void shout(T shoutOut,V valToBring) {
		System.out.println(shoutOut+ "...!!!!");
		System.out.println(valToBring+ "...!!!!");
	}

}

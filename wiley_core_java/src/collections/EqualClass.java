package collections;

import java.util.ArrayList;
import java.util.List;

public class EqualClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=4;
//		int b=2;
//		if(a==b) {
//			System.out.println("equal numbers");
//		}else {
//			System.out.println("unequal numbers");
//		}
		
//		String a=new String("riti");
//		String b=new String("riti");
//		if(a==b) {
//			System.out.println("equal numbers");
//		}else {
//			System.out.println("unequal numbers");
//		}
		
		Dog myDog= new Dog();
		Dog yourDog= new Dog();
		if(myDog.equals(yourDog)) {
			System.out.println("equal numbers");
		}else {
			System.out.println("unequal numbers");
		}
		
		final List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.add(2);
		System.out.println(list);
		
		list.set(1, 4);
		System.out.println(list);

	}

}

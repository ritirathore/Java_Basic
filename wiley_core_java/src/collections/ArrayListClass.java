package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add("a");
		al.add("b");
		al.add("1.22");
		
		System.out.println(al);
		
		List<Integer> firstFivePrimeNumbers  = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		
		System.out.println(firstTenPrimeNumbers);
		
		
		List<Integer> listn = new ArrayList<>();

        listn.add(4);
        listn.add(3);

        listn.remove("4");

        String[] friendsArray = {};
        ArrayList<String> friendArray = new ArrayList<>(Arrays.asList("venkat", "rishav"));
        
        System.out.println(friendsArray);
        System.out.println(friendArray);

	}

}

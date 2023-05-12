package data_structures;

import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Integer> ht= new Hashtable<Integer, Integer>();
		ht.put(123, 432);
		ht.put(12, 29);
		ht.put(15, 18);
		ht.put(19, 20);
		
		ht.remove(12);
		
		System.out.println(ht);

	}

}

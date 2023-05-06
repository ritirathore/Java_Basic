package collections;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap= new TreeMap<>();
		tmap.put(1000, "riti");
		tmap.put(1001, "rathore");
		tmap.put(1002, "kochi");
		tmap.put(1003, "didi");
		tmap.put(3100, "shobs");
		
		System.out.println(tmap); // sorts and prints on the basis of key
		
		tmap.forEach((k,v)->System.out.println("key:"+k+"  val:"+v));
		
		System.out.println("Last key:"+ tmap.lastKey());
		System.out.println("First key:"+tmap.firstKey());
		
		Set<Integer>keyscondition= tmap.headMap(3000).keySet();
		System.out.println(keyscondition);
		
		Set<Integer>keyscondition1= tmap.tailMap(3000).keySet();
		System.out.println(keyscondition1);
		
		TreeMap<String, Integer> userMap= new TreeMap<>();
		userMap.put("riti", 100);
		userMap.put("rathore", 101);
		userMap.put("didi", 102);
		userMap.put("kochi", 98);
		userMap.put("shobs", 90);
		userMap.forEach((k,v)->System.out.println("key:"+k+"  val:"+v));
		
		

	}

}

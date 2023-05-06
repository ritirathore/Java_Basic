package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<>();
		m.put(1,"ome");
		m.put(2,"two");
		m.put(3,"three");
		Iterator itr = m.keySet().iterator();
		while(itr.hasNext()) {
			Integer key=(Integer)itr.next();
			System.out.println("Key: "+ key +", value: "+ m.get(key));
//			m.put(4, "four");
		}
		Map<Integer,String> m1=new ConcurrentHashMap<>();
		m1.put(1,"ome");
		m1.put(2,"two");
		m1.put(3,"three");
		Iterator itr1 = m1.keySet().iterator();
		while(itr1.hasNext()) {
			Integer key=(Integer)itr1.next();
			System.out.println("Key: "+ key +", value: "+ m1.get(key));
			m1.put(4, "four");
		}
		System.out.println(m1);


	}

}

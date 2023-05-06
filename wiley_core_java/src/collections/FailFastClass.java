package collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list= new ArrayList<>();
		List<String> list= new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");
		
		Iterator<String> it= list.iterator();
		
		while(it.hasNext()) {
			
			String str= it.next();
			
			System.out.println(str);
			list.add("c");
		}
		
		System.out.println(list);

	}

}

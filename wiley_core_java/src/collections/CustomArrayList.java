package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomArrayList extends ArrayList {
	
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}else {
			return super.add(o);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomArrayList list = new CustomArrayList();
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		System.out.println(list);
		
//		Set<Student> set= new HashSet<>();
		List<Student> set= new ArrayList<>();
		Student s1= new Student(101, "Riti");
		Student s5= new Student(109, "hey");
		Student s4= new Student(101, "Riti");
		Student s2= new Student(102, "Rathore");
		Student s3= new Student(103, "didi");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Collections.sort(set);
		
		System.out.println(set);
		

	}

}

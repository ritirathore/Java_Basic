package collections;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getId()== o2.getId()) {
//			return 0;
			return o1.getName().compareTo(o2.getName());
		}else if(o1.getId()> o2.getId()){
			return 1;
		}else {
			return -1;
		}
//		return 0;
	}

}

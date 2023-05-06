package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	int id;
	String name;
	float stipend;

	public Student(int id, String name, float stipend) {
		super();
		this.id = id;
		this.name = name;
		this.stipend = stipend;
	}



	public float getStipend() {
		return stipend;
	}



	public void setStipend(float stipend) {
		this.stipend = stipend;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(stipend);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(stipend) != Float.floatToIntBits(other.stipend))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", stipend=" + stipend + "]";
	}



	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
		
//		return 0;
		if(id== obj.id) {
			return 0;
		}else if(id> obj.id){
			return 1;
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		List<Student> set= new ArrayList<>();
		Student s1= new Student(101, "Riti", 100.5f);
		Student s5= new Student(109, "Anjali",200.7f);
		Student s4= new Student(101, "Rati",300.8f);
		Student s2= new Student(102, "Rathore",400);
		Student s3= new Student(103, "Didi",250);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Collections.sort(set, new IdComparator());
		System.out.println(set);
		
	}
}

package wiley_core_java;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Records {
	String name;
	int age;
	boolean gender;
	float grade;
	
	public Records(String name,int age, boolean gender, float grade){
		super();
		this.name= name;
		this.age= age;
		this.gender= gender;
		this.grade= grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		FileOutputStream fout= new FileOutputStream("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\data2.txt");
//		DataOutputStream dos= new DataOutputStream(fout);
//		
//		String name="Riti";
//		String age="23";
//		String gender= "female";
//		String grade= "9";
//		
//		dos.writeUTF(name);
//		dos.writeUTF(age);
//		dos.writeUTF(gender);
//		dos.writeUTF(grade);
//		
//		dos.flush();
//		
//		System.out.println("Saved");
//		dos.close();
//		
//		
//
//	}

}

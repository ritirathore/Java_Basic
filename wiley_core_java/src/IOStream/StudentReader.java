package IOStream;

import java.util.*;

import wiley_core_java.Records;

import java.io.*;

public class StudentReader {
	DataInputStream dataInput;
	
	public StudentReader(String inputFile) throws FileNotFoundException {
		dataInput= new DataInputStream(new FileInputStream(inputFile));
	}
	// data in byte format
	
	@SuppressWarnings("deprecation")
	public List<Records> readAll() throws IOException {
		List<Records> list= new ArrayList<>();
//		String s=null;
		
		try {
//			FileReader fr= new FileReader("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\student.txt");
//			BufferedReader br= new BufferedReader(fr);
//			System.out.println(dataInput.readLine());
//			(s=br.readLine())!=null
			while(true) {
				String name=dataInput.readUTF();
				int age =dataInput.readInt();
				boolean gender= dataInput.readBoolean();
				float grade= dataInput.readFloat();
				
				System.out.println("name::" +name);
				
				Records record= new Records(name,age,gender,grade);
				list.add(record);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		dataInput.close();
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if(args.length<1) {
//			System.out.println("Please provide output file");
//			System.exit(0);
//		}
		
		String inputFile= "D:\\WTraining\\java_concepts\\wiley_core_java\\data\\student.txt";
		
		try {
			StudentReader reader= new StudentReader(inputFile);
			List<Records> l=reader.readAll();
//			readAll();
			
			for(Records r: l) {
				System.out.println(r.getName()+"\t");
				System.out.println(r.getAge()+"\t");
				System.out.println(r.isGender()+"\t");
				System.out.println(r.getGrade());

			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

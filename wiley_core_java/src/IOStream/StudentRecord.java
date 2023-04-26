package IOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import wiley_core_java.Records;

public class StudentRecord {
	
	DataOutputStream dataOutput;
	public StudentRecord(String outputFile) throws IOException {
		dataOutput= new DataOutputStream(new FileOutputStream(outputFile));
	}
	
	public void writer(Records record) throws IOException {
//		dataOutput.writeBytes("name: "+record.getName()+"\n");
//		dataOutput.writeBytes("gender: "+String.valueOf(record.isGender())+"\n");
//		dataOutput.writeBytes("age: "+String.valueOf(record.getAge())+"\n");
//		dataOutput.writeBytes("grade: "+String.valueOf(record.getGrade())+"\n");
//		dataOutput.writeBytes("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
//		
		
		dataOutput.writeUTF(record.getName());
		dataOutput.writeInt(record.getAge());
		dataOutput.writeBoolean(record.isGender());
		dataOutput.writeFloat(record.getGrade());
		
		
//		byte[] str= record.getName().getBytes();
//		dataOutput.write(str);
//		byte b=  (byte) (record.isGender()? 1:0);
////				booleanToBytes(record.isGender(), b);
//		dataOutput.write(b);
		
//		Integer i= new Integer(record.getAge());
//		byte mb= i.byteValue();
//		dataOutput.write(mb);
//		Float f= new Float(record.getGrade()) ;
//		byte fb= f.byteValue();
//		dataOutput.write(fb);
		
	}
	
	public void save() throws IOException {
		dataOutput.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		if(args.length<1) {
//			System.out.println("Please provide output file");
//			System.exit(0);
//		}
//		String outputFile= args[0];
		String outputFile= "D:\\WTraining\\java_concepts\\wiley_core_java\\data\\student.txt";
		List<Records> list= new ArrayList<>();
		list.add(new Records("Riti",23,false,9.1f));
		list.add(new Records("Rati",25,true,9.2f));
		list.add(new Records("Rata",26,false,9.3f));
		list.add(new Records("Roti",24,false,8.4f));
		
		try {
			StudentRecord outputWriter= new StudentRecord(outputFile);
			for(Records r: list) {
				outputWriter.writer(r);
			}
			outputWriter.save();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

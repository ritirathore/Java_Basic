package IOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fout= new FileOutputStream("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\data2.txt");
//		DataOutputStream dos= new DataOutputStream(fout);
//		
//		dos.writeBytes("I am a programmer");
//		dos.flush();
//		dos.close();
		
		FileInputStream fin= new FileInputStream("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\data2.txt");
		DataInputStream dis= new DataInputStream(fin);
		
		int count = fin.available();
		byte[] ba= new byte[count];
		
		dis.read(ba);
		
		for(byte b: ba) {
			System.out.println((char)b);
		}
		
		dis.close();
		fin.close();
		

	}

}

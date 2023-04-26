package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AbstractStream {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		InputStream fr= new FileInputStream("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\data3.txt");
//		
//		int i=0;
//		
//		while((i=fr.read())!=-1) {
//			System.out.println((char)i);
//			
//		}
//		fr.close();
		
		OutputStream fout= new FileOutputStream("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\data3.txt");
		String str= "Wiley Edge KT";
		byte[] b= str.getBytes();
		fout.write(b);
		fout.flush();
		fout.close();

	}

}

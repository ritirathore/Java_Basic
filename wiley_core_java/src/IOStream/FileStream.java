package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fout= new FileOutputStream("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\data3.txt");
//		String str= "Wiley Edge";
//		byte[] b= str.getBytes();
//		fout.write(b);
//		fout.flush();
//		fout.close();
		
		FileInputStream fr= new FileInputStream("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\data3.txt");
		int i=0;
		while((i=fr.read())!=-1) {
			System.out.println((char)i);
			
		}
		fr.close();

	}

}

package IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CharacterStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer out= new OutputStreamWriter(System.out);
		Writer fw= new FileWriter("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\data3.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("I am Riti Rathore");
		
		bw.flush();
		bw.close();
		fw.close();
		

	}

}

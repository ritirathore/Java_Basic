package optimization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MemoryLeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		inefficient
//		FileInputStream fis= null;
//		
//		try {
//			fis= new FileInputStream("myFile.txt");
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}finally {
//			if(fis!=null) {
//				try {
//					fis.close();
//				}catch(IOException e2) {
//					e2.printStackTrace();
//				}
//			}
//		}
		
		
//		efficient
		try(FileInputStream fis= new FileInputStream("myFile.txt")){
			//write the logic
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}

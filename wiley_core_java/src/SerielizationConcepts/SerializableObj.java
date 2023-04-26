package SerielizationConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1= new Book(29,"Java");
		
		try (FileOutputStream fos= new FileOutputStream("books.ser");
			ObjectOutputStream oos= new ObjectOutputStream(fos);){
//			FileOutputStream fos= new FileOutputStream("books.ser");
//			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(b1);
			fos.close();
			System.out.println("Task Done");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}

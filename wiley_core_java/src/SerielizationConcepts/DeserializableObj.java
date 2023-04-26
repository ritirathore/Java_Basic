package SerielizationConcepts;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis= new FileInputStream("books.ser");
			ObjectInputStream ois= new ObjectInputStream(fis);
			Book b= (Book) ois.readObject();
			System.out.println("Book code:"+b.bookCode);
			System.out.println("book name:"+b.bookName);
			
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}

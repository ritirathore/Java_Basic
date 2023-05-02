package collections;

import java.util.Enumeration;
import java.util.Vector;

public class CursorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector<String> vc = new Vector<>();
		
		vc.addElement("a");
		vc.addElement("b");
		vc.addElement("c");
		vc.addElement("d");
		vc.addElement("e");
		vc.addElement("f");
		
		Enumeration<String> ev = vc.elements();
		
		while(ev.hasMoreElements()){
			System.out.println(ev.nextElement());
		}

	}

}

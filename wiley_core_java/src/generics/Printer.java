package generics;

import java.io.Serializable;

//public class Printer<T extends Animal & Serializable> {
	public class Printer<T extends Animal > {
	T valToPrint;

	public Printer(T valToPrint) {
		super();
		this.valToPrint = valToPrint;
	}

    public void print() {
    	System.out.println(valToPrint);
    }

}

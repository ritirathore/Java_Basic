package lambda;

@FunctionalInterface
public interface Printable {
//	void print(String arg1, String arg2);
	String print(String arg1);
//	void getName();
	default void sayHi() {
		
	}
	public static void sayOk() {
		
	}
	

}

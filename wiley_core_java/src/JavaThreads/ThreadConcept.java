package JavaThreads;

class Parent{
	public void m1() {
		System.out.println("This is m1 methods");
	}
}

class T1 extends Thread{
	@Override
	public void run() {
		System.out.println("By Thread class");
	}
}

//class T2 extends Parent implements Runnable 
class T2 extends Parent implements Runnable{

	@Override
	public void run() {
		m1();
		System.out.println("By Using Runnable Interface");
	}
}

public class ThreadConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t1 = new T1();
		t1.start();
		
		T2 t2 = new T2();
		Thread trd = new Thread(t2);
		trd.start();

	}

}

package JavaThreads;

class SupportClass extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		if(Thread.currentThread().isDaemon()) {
			System.out.println("This is daemon thread");
		}
		else {
			System.out.println("This is not a daemon thread");
		}
	}
}

public class DemonType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupportClass t1= new SupportClass();
		SupportClass t2= new SupportClass();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();

	}

}

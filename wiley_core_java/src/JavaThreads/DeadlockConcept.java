package JavaThreads;

public class DeadlockConcept {

	public static Object Lock1= new Object();
	public static Object Lock2= new Object();
	
	public static class LockThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
//			super.run();
			synchronized (Lock1) {
				System.out.println("Thread one hold lock 1");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println("Thread 1 waiting for lock 2");
			
			synchronized (Lock2) {
				System.out.println("Thread 1 hold lock 2");
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LockThread lt1= new LockThread();
		lt1.start();

	}

}

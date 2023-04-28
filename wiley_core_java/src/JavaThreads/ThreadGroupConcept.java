package JavaThreads;

class Demo implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name:"+ Thread.currentThread().getName());
	}
}

public class ThreadGroupConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tgParent= new ThreadGroup("Parent Group");
		ThreadGroup tgChild1= new ThreadGroup(tgParent,"child group");
		
		Thread t1= new Thread(tgParent, new Demo(), "first");
		Thread t2= new Thread(tgParent, new Demo(), "second");
		Thread t3= new Thread(tgChild1, new Demo(), "third");
		Thread t4= new Thread(tgParent, new Demo(), "fourth");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
//		t1.stop();
		
		System.out.println("Active Group of Threads:-"+tgParent.activeCount());
		System.out.println("Active Group of child Threads:-"+tgChild1.activeCount());
		
		tgParent.list();

	}

}

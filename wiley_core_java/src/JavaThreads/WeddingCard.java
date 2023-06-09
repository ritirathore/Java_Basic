package JavaThreads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class CardWrap extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		System.out.println("Thread name:"+Thread.currentThread().getName());
	}
}

public class WeddingCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fixed size
//		ExecutorService executor = Executors.newFixedThreadPool(4);
		//cached
//		ExecutorService executor = Executors.newCachedThreadPool();
		
//		for(int i=1;i<=100;i++) {  //100 tasks given
//			executor.execute(new CardWrap());
//		}

		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
//		executor.schedule(new CardWrap(),3,TimeUnit.SECONDS);
		
//		executor.scheduleAtFixedRate(new CardWrap(),10,3,TimeUnit.SECONDS);
		
		executor.scheduleWithFixedDelay(new CardWrap(),5,3,TimeUnit.SECONDS);
	}

}

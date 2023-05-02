package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int size=1000000;
		List<Integer> arrayList = new ArrayList<>();
		long start=System.currentTimeMillis();
		for(int i=0;i<size;i++)
			arrayList.add(i);
		long end=System.currentTimeMillis();
		System.out.println("time taken to add values in arrayList: "+(end-start));
		List<Integer> vectorList = new Vector<>();
		 start=System.currentTimeMillis();
		for(int i=0;i<size;i++)
			vectorList.add(i);
		 end=System.currentTimeMillis();
		System.out.println("time taken to add values in vector: "+(end-start));
		List<Integer> mulitThreadedList = new ArrayList<>();
		 start=System.currentTimeMillis();
		 Thread t1=new Thread(()->{for(int i=0;i<size;i++)
			 mulitThreadedList.add(i);});
		 Thread t2=new Thread(()->{for(int i=0;i<size;i++)
			 mulitThreadedList.add(i);});
		 t1.start();
		 t2.start();
		 t1.join();
		 t2.join();
		 end=System.currentTimeMillis();
		System.out.println("time taken to add values in list in multithreaded env: "+(end-start));
		Vector<Integer> mulitThreadedVector = new Vector<>();
		 start=System.currentTimeMillis();
		 Thread t3=new Thread(()->{for(int i=0;i<size;i++)
			 mulitThreadedVector.add(i);});
		 Thread t4=new Thread(()->{for(int i=0;i<size;i++)
			 mulitThreadedVector.add(i);});
		 t3.start();
		 t4.start();
		 t3.join();
		 t4.join();
		 end=System.currentTimeMillis();
		 
		System.out.println("time taken to add values in vector in multithreaded env: "+(end-start));
		List<Integer> listSynchronized = Collections.synchronizedList(new ArrayList<>());
		 start=System.currentTimeMillis();
		 Thread t5=new Thread(()->{for(int i=0;i<size;i++)
			 listSynchronized.add(i);});
		 Thread t6=new Thread(()->{for(int i=0;i<size;i++)
			 listSynchronized.add(i);});
		 t5.start();
		 t6.start();
		 t5.join();
		 t6.join();
		 end=System.currentTimeMillis();
		System.out.println("time taken to add values in synchronized list in multithreaded env: "+(end-start));




	}

}

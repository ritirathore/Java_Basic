package data_structures;

public class QueueClass {
	private int rear;
	private int front;
	private int SIZE=5;
	private int items[]=new int[SIZE];
	QueueClass(){
		front = -1;
		rear = -1;
	}
	public void enqueue(int ele) {
		if(isFull()) {
			System.out.println("Queue overflow!! prg treminated");

		}
		else {
			if(front ==-1)
				front=0;
			rear++;
			items[rear]=ele;
			System.out.println("insertion successful: "+ele);}
	}
	public Boolean isFull() {
		if(front==0 && rear==SIZE-1)
		return true;
		return false;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty, program is terminated");
			return -1;
		}
		else {
		int element=items[front];
		if(front>=rear) {
			front = -1;
		rear=-1;}
		else {
			front++;
		}
		System.out.println("deletion successful: "+element);
		return element;
		}
	}
	
	public boolean isEmpty() {
		if(front==-1)
		return true;
		return false;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		for(int i=front;i<=rear;i++)
			System.out.println(items[i]);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueClass myQueue = new QueueClass();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);
		myQueue.enqueue(4);
		myQueue.enqueue(5);
		myQueue.display();
		myQueue.dequeue();
		myQueue.display();


	}

}

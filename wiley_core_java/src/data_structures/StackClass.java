package data_structures;

public class StackClass {
	private int arr[];
	private int top;
	private int capacity;
	StackClass(int size){
		arr=new int[size];
		capacity=size;
		top = -1;
		
	}
	public void push(int ele) {
		if(isFull()) {
			System.out.println("Stack overflow!! prg treminated");
			System.exit(1);
		}
			arr[++top]=ele;
			System.out.println("insertion successful: "+ele);
	}
	public Boolean isFull() {
		return top==capacity-1;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty, program is terminated");
			System.exit(1);
		}
		return arr[top--];
	}
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void printStack() {
		for(int i=0;i<=top;i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackClass myStack = new StackClass(5);
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.printStack();
		myStack.pop();
		myStack.printStack();


	}

}

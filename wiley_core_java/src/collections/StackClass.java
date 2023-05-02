package collections;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(9);
		st.push(10);
		st.push(12);
		System.out.println(st);
		System.out.println("checking empty stack: "+st.isEmpty());
		st.pop();
		System.out.println("after pop element: "+st);


	}

}

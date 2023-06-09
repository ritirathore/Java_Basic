package data_structures;

public class LinkedListClass {
	static Node head;
	static class Node{
		int value;
		Node next;
		
		public Node(int d) {
			value= d;
			next= null;
		}
	}
	//append
	//ngeiningg 
	//middle
	public static void insertAtFront(Node n) {
//		Node n= new Node(d);
		n.next= head;
		head=n;
	}
	public static void append(Node n) {
//		Node n= new Node(d);
		if(head==null) {
			head= n;
			return;
		}
		n.next= null;
		Node t= head;
		while(t.next!=null) {
			t= t.next;
		}
		t.next= n;
		return;
	}
	public static void insertAtMiddle(Node prev, Node n) {
		if(prev==null) {
			System.out.println("prev is null");
			return;
		}
		n.next= prev.next;
		prev.next= n;
	}
	
	public static int search(int x) {
		Node curr= head;
		int count=0;
		while(curr!=null) {
			count++;
			if(curr.value== x) {
				return count;
			}
			curr= curr.next;
		}
		return count;
	}
	
	public static void sortFunc() {
		Node curr=head;
		Node in= null;
		int temp;
		
		if(head==null) {
			return;
		}else {
			while(curr!=null) {
				in= curr.next;
				while(in!=null) {
					if(curr.value>in.value) {
						temp= curr.value;
						curr.value= in.value;
						in.value= temp;
					}
					in= in.next;
				}
				curr= curr.next;
			}
		}
	}
	
	public static void deleteNode(int key) {
		  Node temp = head, prev = null;
		  if (temp != null && temp.value == key) {
		    head = temp.next;
		    return;
		  }
		  while (temp != null && temp.value != key) {
		    prev = temp;
		    temp = temp.next;
		  }
		  if (temp == null)
		    return;
		 
		  prev.next = temp.next;
		}
	
	public static void deleteStart() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		head= head.next;
		
	}
	public static void deleteEnd() {
		if(head==null) {
			return;
		}
		if(head.next==null) {
			head=null;
		}
		Node n= head;
		while(n.next.next!=null) {
			n= n.next;
		}
		n.next= null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListClass list= new LinkedListClass();
		list.head= new Node(1);

		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		append(second);
		append(third);
		append(fourth);
		
		Node f= new Node(10);
		insertAtFront(f);
		
		Node m= new Node(15);
		insertAtMiddle(second,m);
		
		int a=search(4);
		if(a==0) {
			System.out.println("Not found!!!");
		}else {
			System.out.println("search:"+a);
		}
		
		sortFunc();
		
		deleteNode(2);
		deleteStart();
		deleteEnd();
		
		
//		list.head.next= second;
//		second.next= third;
//		third.next= fourth;
		
		
		while(list.head!=null) {
			System.out.println(list.head.value+"   ");
			list.head=list.head.next;
		}
		
		
	}

}

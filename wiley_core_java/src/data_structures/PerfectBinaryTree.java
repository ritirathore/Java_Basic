package data_structures;

public class PerfectBinaryTree {
	
	static class Node{
		int key;
		Node left, right;
	}
	static int depth(Node node) {
		int d=0;
		while(node!=null) {
			d++;
			node= node.left;
		}
		return d;
	}
	
	static boolean isPerfect(Node root, int d, int level) {
		if(root==null) {
			return true;
		}
		if(root.left==null && root.right==null) {
			return d==level+1;
		}
		if(root.left==null || root.right==null) {
			return false;
		}
		return isPerfect(root.left, d, level+1) && isPerfect(root.right,d,level+1);
	}
	
	//wrapper function
	static boolean is_Perfect(Node root) {
		int d= depth(root);
		return isPerfect(root,d,0);
	}

	static Node newNode(int key) {
		Node node= new Node();
		node.key=key;
		node.left=node.right= null;
		return node;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		root= newNode(1);
		root.left= newNode(2);
		root.right= newNode(3);
		root.left.left= newNode(4);
		root.left.right= newNode(5);
		root.right.left= newNode(6);
		root.right.right= newNode(7);
		
		if(is_Perfect(root)) {
			System.out.println("Perfect Binary Tree");
		}else {
			System.out.println("Not Perfect");
		}

	}

}

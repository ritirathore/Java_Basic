package data_structures;

class Node{
	int item;
	Node left, right;
	
	public Node(int key) {
		item = key;
		left= right= null;
	}
}

public class BinaryTree {
	static Node root;
	
	static void postOrder(Node node) {
		if(node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
//		postOrder(root);
		System.out.print(node.item+"-->");
	}
	
	static void inOrder(Node node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.item+"-->");
		inOrder(node.right);
//		postOrder(root);
		
	}
	
	static void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.item+"-->");
		preOrder(node.left);
		
		preOrder(node.right);
//		postOrder(root);
		
	}
	
	
	
	public BinaryTree() {
		root= null;
	}
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree();
		tree.root= new Node(1);
		tree.root.left= new Node(12);
		tree.root.right= new Node(9);
		tree.root.left.left= new Node(5);
		tree.root.left.right= new Node(6);
		System.out.println("Inorder Traversal:");
		inOrder(root);
		System.out.println("\nPreorder Traversal:");
		preOrder(root);
		System.out.println("\nPostorder Traversal:");
		postOrder(root);
		
	}

}

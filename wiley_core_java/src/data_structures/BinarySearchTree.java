package data_structures;


//class BST{
//	boolean search(Node1 root, int x) {
//		if(root==null)return false;
//		
//		if(root.key==x) return true;
//		else if(root.key>x) return search(root.right,x);
//		else return search(root.left,x);
//	}
//}

//class Node1{
//int key;
//Node left, right;
//public Node1(int item) {
//	key= item;
//	left= right= null;
//	
//}
//}
//Node root;
//
//public BinarySearchTree() {
//root=null;
//}

public class BinarySearchTree {

	Node root;
	public BinarySearchTree() {
		root = null;
	}
	boolean search(Node root, int x) {
		if(root == null) return false;
		if(root.item == x) {
			return true;
		} else if (root.item>x) {
			return search(root.left,x);
		} else if(root.item<x) {
			return search(root.right,x);
		}
		return false;
	}
	void insert(int key) { 
		root = insertRec(root, key); 
		}

    Node insertRec(Node root, int key)
    {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        else if (key < root.item)
            root.left = insertRec(root.left, key);
        else if (key > root.item)
            root.right = insertRec(root.right, key);

        return root;
    }
    
    void inorder() {
    	inorderRec(root); 
    	}

    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.item + " ");
            inorderRec(root.right);
        }
    }
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		BinarySearchTree tree = new BinarySearchTree();
		bst.root = new Node(8);
		bst.root.left = new Node(3);
		bst.root.right = new Node(10);
		bst.root.left.left = new Node(1);
		bst.root.left.right = new Node(5);
		bst.root.right.left = new Node(9);
		System.out.println(bst.search(bst.root,9));
		
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorder();
	}

}

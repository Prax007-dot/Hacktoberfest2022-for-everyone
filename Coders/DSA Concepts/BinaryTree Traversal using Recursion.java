package learnJava;
import java.util.*;

public class BinaryTree {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	static Node createTree() {
		Node root = null;
		System.out.println("Enter Data");
		Scanner sc = new Scanner(System.in);
		
		int data=sc.nextInt();
		
		if(data==-1) {return null;}
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter rigth for " + data);
		root.right = createTree();
		
		return root;
		
	}
	
	static void preOrder(Node root) {//NLR
		if (root==null)
			return;
		System.out.print(root.data);
		
		preOrder(root.left);
		
		preOrder(root.right);
	}
	
	static void postOrder(Node root) {//LRN
		if (root==null)
			return;
		postOrder(root.left);
		
		postOrder(root.right);
		System.out.print(root.data);
	}
	
	static void inOrder(Node root) {//LNR
		if (root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data);
		inOrder(root.right);
	}
	
	
	static int sizeOf(Node root) {
		if (root == null) {return 0;}
		return sizeOf(root.left)+sizeOf(root.right)+1;
	}
	
	
	
	
	public static void main(String[] args) {
		Node root = createTree();
		
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		
		//System.out.println(sizeOf(root));
		
		

		
		
	}
}

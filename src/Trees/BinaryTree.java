package Trees;
import java.util.*;

public class BinaryTree {
	
	private Node root;
	Scanner ob=new Scanner("50 true 12 true 18 false false true 13 false false false");
	
	private class Node{
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value) {
			this.value=value;
			this.left=null;
			this.right=null;
		}
	}
	
	public void generate() {
		System.out.println("enter the value of root");
		int rootvlaue=ob.nextInt();
		root=new Node(rootvlaue);
		generate(root);
		
	}
	
	private void generate(Node node) {
		
		System.out.println("do you want to add left of"+node.value);
		boolean left=ob.nextBoolean();
		
		if(left) {
			int leftValue=ob.nextInt();
			node.left=new Node(leftValue);
			generate(node.left);
		}
		
		System.out.println("do you want to add right of"+node.value);
		boolean right=ob.nextBoolean();
		
		if(right) {
			int rightValue=ob.nextInt();
			node.right=new Node(rightValue);
			generate(node.right);
		}
	}
	
	
	public void inorder() {
		inorder(root);
	}
	
	private void inorder(Node node) {
		if(node==null) {
			return;
		}
		
		
		inorder(node.left);
		System.out.print(node.value+" ");
		inorder(node.right);
		
		
	}
	
	public void PreorderIterative() {
		Stack<Node> s=new Stack<>();
		s.add(root);
		while(!s.isEmpty()) {
			Node temp=s.pop();
			
			System.out.print(temp.value+" ");
			if(temp.left!=null) {
				s.add(temp.left);
			}
			if(temp.right!=null) {
				s.add(temp.right);
			}
		}
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(Node node) {
		if(node==null) {
			return;
		}
		
		System.out.print(node.value+" ");

		preOrder(node.left);
		preOrder(node.right);
		
		
	}
	
	public void display() {
		display(root,"");
	}
	
	private void display(Node node,String s) {
		if(node==null) {
			return;
		}
		
		System.out.println(s+node.value);
		display(node.left,s+"\t");
		display(node.right,s+"\t");
		
	
	}
	
	
	public void levelOrder() {
		if(root==null) {
			return;
		}
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			
			Node front=queue.remove();
			System.out.print(front.value+" ");
			if(front.left!=null) {
				queue.add(front.left);
			}
			if(front.right!=null) {
				queue.add(front.right);
			}
		}
		
	}
	
//	public void genPreInRec(int[] pre,int[] in) 
//		
//		
//		int position=linear(in, pre[0]);
//		int left_Pre=Arrays.copyOfRange(pre, from, to)
//		
//	}
	
	private int linear(int a[],int m) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==m) {
				return i;
			}
		}
		 return -1;
	}
	
	public int height() {
		return depth(root)+1;
	}
	
	private int depth(Node node) {
		if(node==null) {
			return -1;
		}
		int max=Math.max(depth(node.left), depth(node.right));
		return max+1;
	}
}
				
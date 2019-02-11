package Trees;

//import Trees.BinaryGenericTree.Node;

public class BST<T extends Comparable<T>> extends BinaryGenericTree  {

	private Node root;




	public T min() {
		if(root==null) {
			return null;
		}
		Node node=root;
		while(node.left!=null) {
			node=node.left;
		}
		return node.value;
	}


	public T max() {
		if(root ==null) {
			return null;
		}

		return max(root).value;
	}

	private Node max(Node node) {
		if(node.right==null) {
			return node;
		}
		return max(node.right);
	}

	public boolean find(T value) {
//		if(root ==null) {
//			return false;
//		}
//		
		Node node=root;

		while(node!=null) {

			if(node.value.compareTo(value)>0) {
				node=node.left;
			}
			else if(node.value.compareTo(value)<0) {
				node=node.right;
			}
			else {
				return true;
			}
		}
		return false;
	}

	public void add(T value) {
		this.root=add(value,root);

	}

	public void display(){
		display(root, "", "root");
	}

	private void display(Node node, String indent, String type){
		if (node == null){
			return;
		}

		System.out.println(indent + node.value + " " + type);

		display(node.left, indent + "\t", "left");
		display(node.right, indent + "\t", "right");
	}


	private  Node add(T value ,Node node) {
		if(node==null) {
			return new Node(value);
		}
		if(node.value.compareTo(value)>0) {
			node.left=add(value,node.left);
		}

		if(node.value.compareTo(value)<0) {
			node.right=add(value,node.right);
		}
		return node;
	}



	private class Node{
		private T value;
		private Node left;
		private Node right;

		public Node(T value) {
			this.value=value;
		}

	}

}

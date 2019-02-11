package Trees;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree myTree=new BinaryTree();
		myTree.generate();
		myTree.display();
		System.out.println("Height is"+myTree.height());
		System.out.println("Inorder traverasal");
		myTree.inorder();
		System.out.println();
		System.out.println("preOrder traversal");
		myTree.preOrder();
		
		
		System.out.println();
		myTree.levelOrder();
		
		System.out.println();
		myTree.PreorderIterative();
	}

}

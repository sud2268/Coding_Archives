package Trees;

public class Main {
	public static void main(String[] args) {
		BST<Integer> bst=new BST<>();
		bst.add(5);
		bst.add(3);
		bst.add(7);
		bst.add(6);
		bst.display();
		System.out.println(bst.min());
		System.out.println(bst.max());
		System.out.println(bst.find(2));
	}
}
														
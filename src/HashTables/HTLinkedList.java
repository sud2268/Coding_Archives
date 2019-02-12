package HashTables;

import java.util.LinkedList;

public class HTLinkedList<K,V> {
	
	private LinkedList<Node> list =new LinkedList<>();

	
	//node DS for linked list
	private class Node{
		private K key;
		private V value;
		//constructor
		public Node(K key,V value) {
			this.key=key;
			this.value=value;
		}
	}

	public void put(K key,V value) {
		//Note we will need to create a node to traverse a linked list
		//we cannot do it by creating hashcode for position
		for(Node node:list) {
			if(node.key.equals(key)) {
				node.value=value;
				return;
				
			}
		}
		list.add(new Node(key, value));
		
	}
	//to get the value at specified position in linked list
	
	public V get(K key) {
		for (Node node : list) {
			if (node.key.equals(key)) {
				return node.value;
			}
			
		}
		return null;
	}
	
	//to display the node of linked list
	public void display() {
		for (Node node : list) {
			System.out.println(node.value);
			
		}
	}
	
	public V remove(K key) {
		Node temp=null;
		for (Node node : list) {
			if (node.key.equals(key)) {
				temp=node;
			}
			
		}
		list.remove(temp);
		return temp.value;
	}
	
	
}

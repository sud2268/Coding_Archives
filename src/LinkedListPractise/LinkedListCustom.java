package LinkedListPractise;

public class LinkedListCustom {
	
	Node head;
	Node tail;
	private class Node{
		private int data;
		private Node next;
	
		public Node(int value){
			this.data=value;
			this.next=null;
		}
		
	}
	
	
	public void insertFirst(int value) {
		Node temp=new Node(value);
		if(head==null) {
			head=temp;
			tail=temp;
		}
		else {
			temp.next=head;
			head=temp;
		}
	}
	public void insertLast(int value) {
		Node temp=new Node(value);
		if(head==null) {
			insertFirst(value);
			return;
					
		}
		tail.next=temp;
		temp=tail;
		
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +"->");
			temp=temp.next;
		}
		System.out.println("End");
		//System.out.println("tail="+this.tail.data);
	}
}

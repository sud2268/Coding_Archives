package LinkedListPractise;

public class LinkedListGc {

	private class Node{
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		public Node() {

		}

	}

	private Node head ;
	private Node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size==0;
	}

	public int getFirst()throws Exception {
		if(isEmpty()) {
			throw new Exception("LL is Empty");
		}

		return this.head.data;
	}

	public int getLast()throws Exception {

		if(isEmpty()) {
			throw new Exception("LL is Empty");
		}

		return this.tail.data;
	}


	public int getAt(int index) throws Exception {
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}

		if(index<0||index>=size) {
			throw new Exception("Index not correct");
		}


		Node temp=head;
		for (int i = 0; i < index; i++) {
			temp=temp.next;
		}
		return temp.data;

	}

	public Node getNodeAt(int index) throws Exception {
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}

		if(index<0||index>=size) {
			throw new Exception("Index not correct");
		}


		Node temp=head;
		for (int i = 0; i < index; i++) {
			temp=temp.next;
		}
		return temp;

	}

	public void display() throws Exception {

		Node temp=head;
		if(isEmpty()) {
			throw new Exception("LL is Empty");
		}

		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}


	public void addFirst(int item) {

		Node nn=new Node(item);

		//attach
		nn.next=this.head;

		//update
		if(isEmpty()) {
			this.head=nn;
			this.tail=nn;
			this.size=1;
		}
		else {
			this.head=nn;
			this.size++;
		}

	}

	public void addLast(int item) {

		Node nn=new Node(item);

		//attach
		this.tail.next=nn;

		//update
		if(isEmpty()) {
			addFirst(item);
		}
		else {
			this.tail=nn;
			this.size++;
		}

	}
	
	public void addAt(int index,int item)throws Exception {
		
		if(isEmpty()) {
			addFirst(item);
		}
		
		Node prevNode=getNodeAt(index-1);
		Node nextNode=getNodeAt(index);
		
		Node nn=new Node(item);
		
		prevNode.next=nn;
		nn.next=nextNode;
		
		this.size++;
	}

	public int removeFirst() throws Exception{
		
		if(this.isEmpty()) {
			throw new Exception("LL is Empty");
		}
		
		int rv=this.head.data;
		
		if(size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
		}
		else {
			this.head=head.next;
			this.size--;
		}
		
		return rv;
		
	}
	
	
	public int removeLast() throws Exception{
		
		if(this.isEmpty()) {
			throw new Exception("LL is Empty");
		}
		
		int rv=this.tail.data;
		
		
		if(size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
		}
		else {
			Node newTail=getNodeAt(size-2);
			
			newTail.next=null;
			
			this.tail=newTail;
			this.size--;
		}
		
		return rv;
	}
	
	public int NodeAt(int idx) throws Exception{
		
		if(isEmpty()) {
			throw new Exception("LL is Empty");
		}
		
		if(idx<0||idx>=size) {
			throw new Exception("index incorrect");
		}
		
		int rv=0;
		if(idx==0) {
			removeFirst();
		}else if(idx==size-1) {
			removeLast();
		}else {
		
		Node prevNode=getNodeAt(idx-1);
		Node nextNode=getNodeAt(idx+1);
		Node current=getNodeAt(idx);
		
		//value to be  removed
		rv=current.data;
		
		//update linked List
		prevNode.next=nextNode;
		}
		
		return rv;
		
	}

	public void reverseDataIter()throws Exception{
		
	}
	
	public Node midNode() {
		Node fast=head;
		Node slow=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			//condition1 for odd  no. of nodes and condition 2 for even number of nodes
			//if any of the condition violates the loop terminates
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
}

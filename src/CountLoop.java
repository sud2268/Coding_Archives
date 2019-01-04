
class node{
	int data;
	node next;
	node(int d)
	{
		data=d;
		next=null;
	}
	
}

public class CountLoop {
	
	node head;
	
	public void push(int data)
	{
		node tnode=new node(data);
		tnode.next=head;
		head=tnode;
		
	}
	
	public boolean detect() {
		node slowPtr=head,fastPtr=head;
		while(slowPtr !=null &&fastPtr!=null ) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
			if(slowPtr==fastPtr)
				return true;
			
		}
		return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountLoop ob=new CountLoop();
		ob.push(5);
		ob.push(4);
		ob.push(3);
		ob.push(2);
       // ob.head.next.next.next.next = ob.head; 
		
		if(ob.detect())
			System.out.println("loop present" );
		else
			System.out.println("loop not present" );


	}

}

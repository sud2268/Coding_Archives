package HashTables;

import java.util.ArrayList;

public class HTArrayList<K,V> {
	
	public HTArrayList() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 10; i++) {
			list.add(null);
		}
	}
	
	private ArrayList<Node> list =new ArrayList<>();
	
	//node DS for ArrayList
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
			int loc=Math.abs(key.hashCode())%list.size();
			
			list.set(loc, new Node(key, value));
			
		}
		
		public V get(K key) {
			int loc=Math.abs(key.hashCode())%list.size();
			if(list.get(loc)!=null && list.get(loc).key.equals(key)) {
				return list.get(loc).value;
			}
			
			return null;
		}
}

package Graphs;
import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	
	//Main hashmap vertices
	HashMap<String , Vertex> vertices; 
	
	//Vertex object
	private class Vertex{
		HashMap<String , Integer> nbrs=new HashMap<>();
	}
	
	//constructor of the graph class
	public Graph() {
		vertices=new HashMap<>();
	}
	
	//check if contains key 
	public boolean containsKey(String vname) {
		return this.vertices.containsKey(vname);
	}
	
	
	//count number of vertex
	public int countVertex() {
		return this.vertices.size();
	}
	
	//add vertex to graph
	public void addVertex(String Vname) {
		Vertex vtx=new Vertex();
		vertices.put(Vname, vtx);
	}
	
	//count number of edges
	public int numEdges() {
		
		ArrayList<String> keys=new ArrayList<>(vertices.keySet());
		int count=0;
		for (String key : keys) {
			Vertex vtx=vertices.get(key);
			count+=vtx.nbrs.size();
		}
		return count/2;
	}
	
	
	//contains edge
	public boolean containsEdge(String vname1,String vname2) {
		
		Vertex vtx1=vertices.get(vname1);
		Vertex vtx2=vertices.get(vname2);
		
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}
	
	//add edge
	public void addEdge(String vname1 ,String vname2,int cost) {
		Vertex vtx1=vertices.get(vname1);
		Vertex vtx2=vertices.get(vname2);
		
		if(vtx1==null || vtx2==null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}
	
	
	//remove Edge
	public void removeEdge(String vname1 ,String vname2) {
		Vertex vtx1=vertices.get(vname1);
		Vertex vtx2=vertices.get(vname2);
		
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}
	
	//remove Vertex
	public void removeVertex(String vname) {
		
		//get the object of Type vertex at the 
		Vertex vtx=vertices.get(vname);
		
		ArrayList<String > keys =new ArrayList<>(vtx.nbrs.keySet());
		for (String key : keys) {
			//object of type vertex is created to store the object at that key
			Vertex nbrvertex=vertices.get(key);
			nbrvertex.nbrs.remove(vname);
		}
		vertices.remove(vname);
		
	}
	public void display() {
		//create an arraylist of all the keys present in the vertices hashmap
		ArrayList<String> keys=new ArrayList<>(vertices.keySet());
		
		//Traverse over keys
		for (String key : keys) {
			
			//create an object vertex to get the object at that key 
			Vertex vertex=vertices.get(key);
			
			//print the neighbours hashmap of the vertex
			System.out.println(key +"\t" +vertex.nbrs);
		}
	}
	
}

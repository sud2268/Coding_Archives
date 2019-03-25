package Graphs;

import Graphs.Graph;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph=new Graph();
		graph.addVertex("a");
		graph.addVertex("b");
		graph.addVertex("c");
		graph.addVertex("d");
		graph.addVertex("e");
		graph.addVertex("f");
		graph.addVertex("g");
		graph.addEdge("a", "b", 2);
		graph.addEdge("a", "d", 3);
		graph.addEdge("b", "c", 4);
		graph.addEdge("c", "d", 5);
		graph.addEdge("d", "e", 6);
		System.out.println(graph.containsKey("c"));
		System.out.println(graph.countVertex());
		System.out.println(graph.numEdges());
		System.out.println(graph.containsEdge("a", "b"));
		System.out.println();
		graph.display();
		graph.removeEdge("b", "c");
		System.out.println("....................");
		graph.removeVertex("f");
		graph.display();
		System.out.println("....................");

		graph.removeVertex("a");
		graph.display();
		
		
	}

}

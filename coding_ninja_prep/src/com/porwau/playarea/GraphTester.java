package com.porwau.playarea;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph{
	private LinkedList<Integer>[] adj;
	
	public Graph(int size) {
		adj = new LinkedList[size];
		for(int i = 0; i < size; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	public  void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
		
	}
	public int bfs(int source, int destination) {
		boolean[] visited = new boolean[adj.length];
		int[] parent = new int[adj.length];
		Queue<Integer> q = new LinkedList();
		q.add(source);
		visited[source] = true;
		parent[source] = -1;
		while(!q.isEmpty()) {
			//explore vertices.
			int curr = q.poll();
			if(curr == destination) {break;}
			for(int neighbor: adj[curr]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					q.add(neighbor);
					parent[neighbor] = curr;
				}
			}	
		}
		System.out.println("Parent array - " + Arrays.toString(parent));
		if(!DConstants.capabilities.contains("NVSAN1")) {
			System.out.println("cap mismatch");
		}
		int curr = destination;
		int distance = 0;
		while(parent[curr] != -1) {
			curr = parent[curr];
			distance++;
		}
		return distance;
	}
	
	public void bfs() {
		boolean[] visited = new boolean[adj.length];
		Queue<Integer> q = new LinkedList();
		q.add(0);
		visited[0] = true;
		System.out.print(0+ "->");
		while(!q.isEmpty()) {
			//explore vertices.
			for(int vertex: adj[q.poll()]) {
				if(!visited[vertex]) {
					visited[vertex] = true;
					q.add(vertex);
					System.out.print(vertex+ "->");
				}
			}	
		}
		System.out.print("null");

		
	}
	
	public boolean dfs(int source, int destination) {
		boolean [] visited = new boolean[adj.length];
		visited[source] = true;
		return dfsutil(source, destination, visited);
	}
	
	private boolean dfsutil(int source, int destination, boolean[] vis) {
		if(source == destination) return true;		
		for(int neighbor:adj[source]) {
			if(!vis[neighbor]) {
				vis[neighbor] = true;
				return dfsutil(neighbor, destination, vis);
			}
		}
		return false;
	}
	
	public boolean dfsStack(int source, int destination) {
		
		if(source == destination) return true;
		Stack<Integer> stack = new Stack<>();
		boolean[] visited = new boolean[adj.length];
		stack.push(source);
		visited[source] = true;
		while(!stack.isEmpty()) {
			int node = stack.pop();
			if(node == destination) return true;
			for(int neighbor:adj[node]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					stack.push(node);
					stack.push(neighbor);
					break;
				}
			}
		}
		return false;
	}
}
public class GraphTester{
	public static void main(String[] args) {
		Graph g = new Graph(5);
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter number of vertices - ");
//		int v= in.nextInt();
//		System.out.print("Enter number of edges - ");
//		int edges =  in.nextInt();
//		
//		for (int i = 1; i <= edges ; i++) {
//			System.out.println("Enter source and destination " );
//			int source = in.nextInt();
//			//System.out.println("Enter destination - " );
//			int destination = in.nextInt();
//			g.addEdge(source,destination);
//		}
//			 1
//		   /   \
//		  /     \
//		 /       \
//		0 		  2
//		\       / |    
//		 \     /  |     
//		  \   /   |      
//		    4-----3
	
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(0, 4);
		g.addEdge(2, 4);
		System.out.println("Done creating graph" );
		

		/// BFA Graph traversal from 0
		g.bfs();
		//Min distance between 0 and 2.
		System.out.println("Distance between 0 and 3 - " + g.bfs(0, 3));
		System.out.println("is path  between 0 and 3 - " + g.dfs(0, 3));
		System.out.println("is path  between 0 and 3 using stack- " + g.dfsStack(0, 9));



	}
}
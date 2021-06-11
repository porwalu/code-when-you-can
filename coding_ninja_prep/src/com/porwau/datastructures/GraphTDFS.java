package com.porwau.datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

class GDFS {
	private LinkedList<Integer>[] adj;
	private static final int DEFAULT_CAPACITY = 5;

	public GDFS(int capacity) {
		adj = new LinkedList[capacity];
		for (int i = 0; i < capacity; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}

	public void printConnection() {
		for (int i = 0; i < adj.length; i++) {
			System.out.println(i + "->" + adj[i]);
		}
	}

	public void traverse(int source) {
		LinkedList<Integer> stack = new LinkedList<>();
		boolean[] visited = new boolean[adj.length];
		visited[source] = true;
		System.out.print(source + "->");
		int top = source;
		boolean isPushed = false;
		do {
			for (Integer node : adj[top]) {
				if (!visited[node]) {
					visited[node] = true;
					stack.push(top);// ??
					System.out.print(node + "->");
					top = node;
					isPushed = true;
					break;
				}
			}
			if (!isPushed) {
				top = stack.pop();
			}
			isPushed = false;
		} while (!stack.isEmpty());
		System.out.print("end");
	}

	public void dfs(int source) {
		boolean[] visited = new boolean[adj.length];	
		visited[source] = true;
		dfsutil(source,visited);
		System.out.print("end");
	}

	private void dfsutil(Integer source, boolean[] visited) {
		System.out.print(source + "->");
		visited[source] = true;
		for(Integer i : adj[source]) {
			if(!visited[i]) {				
				dfsutil(i,visited);
			}
		}
		
	}
	
	public void dfsStack(int source) {
		LinkedList<Integer> stack = new LinkedList<>();
		boolean[] visited = new boolean[adj.length];
		visited[source] = true;
		System.out.print(source + "->");
		stack.push(source);
		while (!stack.isEmpty()){
			int top = stack.pop();
			for (Integer neighbour : adj[top]) {
				if (!visited[neighbour]) {
					visited[neighbour] = true;
					stack.push(neighbour);// ??
					System.out.print(neighbour + "->");
				}
			}
		} 
		System.out.print("end");
	}

}

public class GraphTDFS {
	public static void main(String[] args) {
		GDFS g = new GDFS(11);
		//GDFS g = new GDFS(5);

//		g.addEdge(0, 1);
//		g.addEdge(1, 2);
//		g.addEdge(2, 3);
//		g.addEdge(3, 4);
//		g.addEdge(0, 4);
//		g.addEdge(2, 4);
//		
		g.addEdge(1, 4);
		g.addEdge(1, 2);
		g.addEdge(4, 3);
		g.addEdge(2, 3);
		g.addEdge(3, 10);
		g.addEdge(3, 9);
		g.addEdge(2, 5);
		g.addEdge(2, 8);
		g.addEdge(2, 7);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(7, 8);
		g.printConnection();
	//	g.traverse(1);
		g.dfs(1);
		System.out.println();
		g.dfsStack(1);
		
	}
}

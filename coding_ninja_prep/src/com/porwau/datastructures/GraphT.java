package com.porwau.datastructures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class MyGraph {
	private Map<Integer, List<Integer>> adj = new HashMap<>();

	public MyGraph() {
		// TODO Auto-generated constructor stub
	}

	public void addEdge(int i, int j) {

		if (adj.containsKey(i)) {
			adj.get(i).add(j);
			if (adj.containsKey(j)) {
				adj.get(j).add(i);
			} else {
				adj.put(j, new ArrayList<>(Arrays.asList(i)));
			}
		} else {
			adj.put(i, new ArrayList<>(Arrays.asList(j)));
			if (adj.containsKey(j)) {
				adj.get(j).add(i);
			} else {
				adj.put(j, new ArrayList<>(Arrays.asList(i)));
			}
		}
	}

	public void traverse() {
		for (Entry<Integer, List<Integer>> val : adj.entrySet()) {
			System.out.println(val.getKey() + "->" + val.getValue());
		}
	}

	public int bfs(int source, int destination) {

		Deque<Integer> queue = new ArrayDeque<>();
		boolean[] visited = new boolean[adj.size()];
		int[] parent = new int[adj.size()];
		if (adj.containsKey(source) && adj.containsKey(destination)) {
			queue.add(source);
			parent[source] = -1;
			visited[source] = true;
		} else {
			System.out.println("Invalid path Entered.");
		}

		while(!queue.isEmpty()) {
			int curr = queue.poll();
			for(int vertex: adj.get(curr)) {
				if(visited[vertex]) {
					continue;
				}else {
					visited[vertex] = true;
					queue.add(vertex);
					parent[vertex]=curr;
				}
			}
		}
		
		int distance = 0;
		System.out.println(Arrays.toString(parent));
		while(parent[destination] != -1) {
			System.out.println("I am here");
			destination = parent[destination];
			distance++;
		}
		return distance;

	}

}

public class GraphT {

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);

		MyGraph g = new MyGraph();

		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(0, 4);
		g.addEdge(2, 4);
		System.out.println("Done creating graph");

		g.traverse();
		System.out.println("Distance is - " + g.bfs(0, 2));
	}

}

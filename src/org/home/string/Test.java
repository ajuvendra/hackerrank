package org.home.string;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	private int V;
	private LinkedList<Integer> adj[];
	int counter = 0;
	
	Test(int v) {
	        V = v;
	        adj = new LinkedList[v];
	        for(int i=0; i<v; ++i)
	            adj[i] = new LinkedList();
	    }

	void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	Boolean isCyclicUtil(int v, Boolean visited[], int parent) {
		visited[v] = true;
		Integer i;

		Iterator<Integer> it = adj[v].iterator();
		while (it.hasNext()) {
			i = it.next();
			if (!visited[i]) {
				if (isCyclicUtil(i, visited, v))
					return true;
			} else if (i != parent)
				return true;
		}
		return false;
	}

	void isCyclic() {
		Boolean visited[] = new Boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;
		for (int u = 0; u < V; u++)
			if (!visited[u]) // Don't recur for u if already visited
				if (isCyclicUtil(u, visited, -1)) {
					counter++;
				}
	}

	static int bestTrio(int friends_nodes, int[] friends_from, int[] friends_to) {
		Test obj = new Test(friends_nodes);
		for (int i = 0; i < friends_nodes; i++) {
			obj.addEdge(friends_from[i], friends_to[i]);
		}
        return obj.counter;
	}
	
	public static void main(String[] args) {
	}
}

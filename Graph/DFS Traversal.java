/*Time Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph. */

/**
 * Link: http://ww3.algorithmdesign.net/handouts/DFS.pdf
 * */
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Graph
{	private int vNumber;
	private ArrayList[] adj; 
	
	public Graph(int V){
		this.vNumber = V;
		adj = new ArrayList[V];
		for(int i=0; i<V; i++)
			adj[i] = new ArrayList<Integer>();
	}
	
	public void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	public void DFSUtil(int v, Boolean[] visited){
		visited[v] = true;
		System.out.println(v+" ");
		
		ArrayList<Integer> list = adj[v];
		for(Integer i: list){
			if(!visited[i])
				DFSUtil(i,visited);
		}
	}
	
	public void DFS(int v){
		Boolean[] visited = new Boolean[vNumber];
		for(int i=0; i<vNumber; i++)
			visited[i] = false;
		
		DFSUtil(v,visited);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{  
		Graph g = new Graph(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		
		System.out.println("DFS traversal");
		g.DFS(2);
	}
}

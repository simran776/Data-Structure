/**
* 
Find the minimum cost to reach destination using a train



There are N stations on route of a train. The train goes from station 0 to N-1. The ticket cost for all pair of stations (i, j) is given where j is greater than i. Find the minimum cost to reach the destination.

Consider the following example:
Input: 
cost[N][N] = { {0, 15, 80, 90},
              {INF, 0, 40, 50},
              {INF, INF, 0, 70},
              {INF, INF, INF, 0}
             };
There are 4 stations and cost[i][j] indicates cost to reach j 
from i. The entries where j < i are meaningless.

Output:
The minimum cost is 65
The minimum cost can be obtained by first going to station 1 
from 0. Then from station 1 to station 3.

Solution 1: Recursive
The minimum cost to reach N-1 from 0 can be recursively written as following:
minCost(0, N-1) = MIN { cost[0][n-1],  
                        cost[0][1] + minCost(1, N-1),  
                        minCost(0, 2) + minCost(2, N-1), 
                        ........, 
                        minCost(0, N-2) + cost[N-2][n-1] } 
                        
Time complexity of the above implementation is exponential as it tries every possible path from 0 to N-1.

Solution 2: DP
One dynamic programming solution is to create a 2D table and fill the table using above given recursive formula. The extra space required in this solution would be O(N2) and time complexity would be O(N3)

We can solve this problem using O(N) extra space and O(N2) time. The idea is based on the fact that given input matrix is a Directed Acyclic Graph (DAG). 
**/

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	public static int minCost(int[][] cost)
	{	int N = cost.length;
    	// dist[i] stores minimum cost to reach station i from station 0.
    	int[] dist = new int[N];
    	for(int i=0; i<N; i++)
       		dist[i] = Integer.MAX_VALUE;
    	
    	dist[0] = 0;
 
    	// Go through every station and check if using it
    	// as an intermediate station gives better path
    	for(int i=0; i<N; i++){
    		for(int j=i+1; j<N; j++){
          		if (dist[j] > dist[i] + cost[i][j])
             		dist[j] = dist[i] + cost[i][j];
    		}
    	}
    	return dist[N-1];
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		  int[][] cost = { {0, 15, 80, 90},
                      {Integer.MAX_VALUE, 0, 40, 50},
                      {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 70},
                      {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
                    };
    	System.out.println("The Minimum cost to reach station " + cost.length + " is " + minCost(cost));
	}
}

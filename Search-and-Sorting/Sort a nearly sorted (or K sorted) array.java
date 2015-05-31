/**
* Given an array of n elements, where each element is at most k away from its target position, 
devise an algorithm that sorts in O(n log k) time. 
 For example, let us consider k is 2, an element at index 7 in the sorted array, 
 can be at indexes 5, 6, 7, 8, 9 in the given array.
**/

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	public static void sortK(int[] arr, int k){
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k+1);
		for(int i=0; i<=k && i<arr.length; i++)
			queue.add(arr[i]);
		
		 for(int i = k+1, ti = 0; ti < arr.length; i++, ti++){
        // If there are remaining elements, then place root of heap at target index and add arr[i]
        // to Min Heap
        	if(i < arr.length){
        		int root = queue.poll();
        		arr[ti] = root;
        		queue.add(arr[i]);
        	}
            	
        // Otherwise place root at its target index and reduce heap size
        	else{
        		int root = queue.poll();
        		arr[ti] = root;
        	}
    }
	}
	
	public static void printArray(int[] arr){
   		for (int i:arr)
       		System.out.println(i);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		  int k = 3;
    	int[] arr = {2, 6, 3, 12, 56, 8};
    	int n = arr.length;
    	sortK(arr, k);
 
    	System.out.println("Following is sorted array");
    	printArray (arr);
	}
}

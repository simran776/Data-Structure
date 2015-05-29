/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	
	public static int findLargestSumPair(int arr[], int n){
    // Initialize first and second largest element
    	int first, second;
    	if (arr[0] > arr[1]){
        	first = arr[0];
        	second = arr[1];
    	}
    	else
    	{
        	first = arr[1];
        	second = arr[0];
    	}
 
    	// Traverse remaining array and find first and second largest
    	// elements in overall array
    	for(int i = 2; i<n; i ++){
        	/* If current element is greater than first then update both
          	first and second */
        	if(arr[i] > first){
            	second = first;
            	first = arr[i];
        	}
 
        	/* If arr[i] is in between first and second then update second  */
        	else if(arr[i] > second && arr[i] != first)
            	second = arr[i];
    	}
    	return (first + second);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		  int[] arr = {12, 34, 10, 6, 40};
    	int n = arr.length;
    	System.out.println("Max Pair Sum is " +  findLargestSumPair(arr, n));
	}
}

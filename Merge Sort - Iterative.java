/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	
	public static int min(int x, int y){
		return x<y?x:y;
	}

	/* l is for left index and r is right index of the sub-array
  		of arr to be sorted */
	public static void mergeSort(int arr[], int n){
		int curr_size;  // For current size of subarrays to be merged
                   // curr_size varies from 1 to n/2
   int left_start; // For picking starting index of left subarray
                   // to be merged
 
   // Merge subarrays in bottom up manner.  First merge subarrays of
   // size 1 to create sorted subarrays of size 2, then merge subarrays
   // of size 2 to create sorted subarrays of size 4, and so on.
   for (curr_size=1; curr_size<=n-1; curr_size = 2*curr_size)
   {
       // Pick starting point of different subarrays of current size
       for (left_start=0; left_start<n-1; left_start += 2*curr_size)
       {
           // Find ending point of left subarray. mid+1 is starting 
           // point of right
           int mid = left_start + curr_size - 1;
 
           int right_end = min(left_start + 2*curr_size - 1, n-1);
 
           // Merge Subarrays arr[left_start...mid] & arr[mid+1...right_end]
           merge(arr, left_start, mid, right_end);
       }
   }
	}
	
	/* Function to merge the two haves arr[l..m] and arr[m+1..r] of array arr[] */
	public static void merge(int arr[], int l, int m, int r){
    	int i, j, k;
    	int n1 = m - l + 1;
    	int n2 =  r - m;
 
    	/* create temp arrays */
    	int[] L = new int[n1];
    	int[] R = new int[n2];
 
    	/* Copy data to temp arrays L[] and R[] */
    	for (i = 0; i < n1; i++)
        	L[i] = arr[l + i];
    	for (j = 0; j < n2; j++)
        	R[j] = arr[m + 1+ j];
 
    	/* Merge the temp arrays back into arr[l..r]*/
    	i = 0;
    	j = 0;
    	k = l;
    	while (i < n1 && j < n2){
        	if (L[i] <= R[j]){
            	arr[k] = L[i];
            	i++;
        	}
        	else{
            	arr[k] = R[j];
            	j++;
        	}
        	k++;
    	}
 
    	/* Copy the remaining elements of L[], if there are any */
    	while (i < n1){
        	arr[k] = L[i];
        	i++;
        	k++;
    	}
 
    	/* Copy the remaining elements of R[], if there are any */
    	while (j < n2){
        	arr[k] = R[j];
        	j++;
        	k++;
    	}
	}
	
	public static void printArray(int A[], int size){
    	int i;
    	for (i=0; i < size; i++)
        	System.out.print(A[i]+ " ");
    	System.out.println();
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  System.out.println("Hello! Hello!!");
		  int[] arr = {12, 11, 13, 5, 6, 7, 2, 8};
    	int arr_size = arr.length;
 
    	System.out.println("Given array is \n");
    	printArray(arr, arr_size);
 
    	mergeSort(arr, arr_size);
 
    	System.out.println("\nSorted array is \n");
    	printArray(arr, arr_size);
    	return;
	}
}

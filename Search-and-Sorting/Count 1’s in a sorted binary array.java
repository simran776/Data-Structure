/**
* Given a binary array sorted in non-increasing order, count the number of 1’s in it. 

Examples: 
Input: arr[] = {1, 1, 0, 0, 0, 0, 0}
Output: 2

Input: arr[] = {1, 1, 1, 1, 1, 1, 1}
Output: 7

Input: arr[] = {0, 0, 0, 0, 0, 0, 0}
Output: 0

We can use Binary Search to find count in O(Logn) time. 
The idea is to look for last occurrence of 1 using Binary Search. Once we find the index last occurrence, 
we return index + 1 as count.
**/
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	public static int countOnes(int arr[], int low, int high)
	{
  		if(high >= low)
  		{
    		// get the middle index
    		int mid = low + (high - low)/2;

    		// check if the element at middle index is last 1
    		if ( (mid == high || arr[mid+1] == 0) && (arr[mid] == 1))
      			return mid+1;

    		// If element is not last 1, recur for right side
    		if (arr[mid] == 1)
      			return countOnes(arr, (mid + 1), high);

    		// else recur for left side
    		return countOnes(arr, low, (mid -1));
  		}
  		return 0;
	}

	public static void main (String[] args) throws java.lang.Exception
	{
	    int arr[] = {1, 1, 1, 1, 0, 0, 0};
      int n = arr.length;
      System.out.println("Count of 1's in given array is " + countOnes(arr, 0, n-1));
	}
}

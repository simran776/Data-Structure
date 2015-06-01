/**
* Given a sorted array arr[] and a value X, find the k closest elements to X in arr[]. 
 Examples: 
Input: K = 4, X = 35
       arr[] = {12, 16, 22, 30, 35, 39, 42, 
               45, 48, 50, 53, 55, 56}
Output: 30 39 42 45

Note that if the element is present in array, then it should not be in output, only the other closest elements are required.
**/
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	public static int findTurningPoint(int[] arr, int low, int high, int x){
		 if(arr[high]<=x)
		  return high;
		 if(arr[low]>x)
			 return low;
			
		 int mid = low + (high-low)/2;
		 if(arr[mid]<=x && arr[mid+1]>x)
			 return mid;
		 if(arr[mid]<x)
			 return findTurningPoint(arr, mid+1, high, x);
		
		 return findTurningPoint(arr,low,mid-1,x);
	}
	
	public static void printKClosest(int[] arr, int x, int k){
		 int l=findTurningPoint(arr, 0, arr.length-1, x);
		 int r=l+1;
		 int count = 0;
		
		 if(arr[l]==x)
			 l--;
		
		 while(l>=0 && r<arr.length && count<k){
			 if(x-arr[l]<arr[r]-x){
				 System.out.println(arr[l]);
				 l--;
			 }
			 else{
				 System.out.println(arr[r]);
				 r++;
			 }
			 count++;
		}
		
		while(count<k && l>=0){
			 System.out.println(arr[l]);
			 l--;
			 count++;
		}
		
		while(count<k && r<arr.length){
			System.out.println(arr[r]);
			r++;
			count++;
		}
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		   int arr[] ={12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
   		int x = 35, k = 4;
   		printKClosest(arr, x, 4);
	}
}

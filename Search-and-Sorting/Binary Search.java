/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	public static int binarySearchRecursion(int[] arr, int x){
		if(arr==null || arr.length==0) return -1;
		return recursionHelper(arr,0,arr.length,x);
	}
	
	public static int recursionHelper(int[] arr, int l, int r, int x){
		if(l<=r){
			int mid = l+(r-l)/2;
			if(arr[mid]==x) return mid;
			else if(arr[mid]>x)
				return recursionHelper(arr,l,mid-1,x);
			else
				return recursionHelper(arr,mid+1,r,x);
		}
		else
			return -1;
	}
	
	public static int binarySearchIter(int[] arr, int x){
		if(arr==null || arr.length==0) return -1;
		int len = arr.length;
		int l = 0, r = len-1;
		
		while(l<=r){
			int mid = l+(r-l)/2;
			if(arr[mid]==x) 
				return mid;
			else if(arr[mid]>x) 
				r=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {2, 3, 4, 10, 40};
   		int len = arr.length;
   		int x = 10;
   		int result = binarySearchIter(arr, x);
   		System.out.println("Iterative Solution: The index of target value is: " + result);
	}
}

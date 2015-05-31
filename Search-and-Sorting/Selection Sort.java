/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	public static void swap(int x, int y, int[] arr){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp; 
	}
	
	public static void selectionSort(int[] arr){
		int len = arr.length;
		int i=0, j=0, minIndex = 0;
		
		for(i=0; i<len-1; i++){
			minIndex = i;
			for(j=i+1; j<len; j++){
				if(arr[j]<arr[minIndex])
					minIndex = j;
			}
			swap(i,minIndex,arr);
		}
	}
	
	public static void printArray(int[] arr){
		for(int i: arr)
			System.out.println(i);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		  int[] arr = {64, 25, 12, 22, 11};
    	selectionSort(arr);
    	System.out.println("Sorted array: ");
    	printArray(arr);

	}
}

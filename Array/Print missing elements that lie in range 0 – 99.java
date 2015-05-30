/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/*
  The idea is to use a boolean array of size 100 to keep track of array elements that lie in range 0 to 99. 
  We first traverse input array and mark such present elements in the boolean array. 
  Once all present elements are marked, the boolean array is used to print missing elements.
*/
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	Boolean[] exist;
	public Ideone(){
		exist = new Boolean[100];
		for(int i=0; i<100; i++)
			exist[i] = false;
	}
	
	public void printRange(int[] array){
		int len = array.length;
		for(int i=0; i<len; i++){
			if(array[i]>=0 && array[i]<100)
				exist[array[i]] = true;
		}
		
		int j = 0;
		while(j<100){
			if(exist[j]==false){
				int k = j+1;
				while(k<100 && exist[k]==false)
					k++;
				if(k==j+1)
					System.out.println(j);
				else
					System.out.println(j + "-" + (k-1));
				
				j=k;
			}
			else
				j++;
		}
	} 
	
	public static void main (String[] args) throws java.lang.Exception
	{	
		Ideone DM = new Ideone();
	
		int[] arr = {88, 105, 3, 2, 200, 0, 10};
		System.out.println("Missing range is: ");
    	DM.printRange(arr);
	}
}

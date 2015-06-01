/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	public static int[] countingSort(int[] a, int k) {
        int c[] = new int[k];
        for (int i = 0; i < a.length; i++)
            c[a[i]]++;
        for (int i = 1; i < k; i++)
            c[i] += c[i-1];
        int b[] = new int[a.length];
        for (int i = a.length-1; i >= 0; i--){
        	int index = c[a[i]]-1;
            b[index] = a[i];
            c[a[i]]--;
        }
        return b;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {7,2,9,0,1,2,0,9,7,4,4,6,9,1,0,9,3,2,5,9};
		int[] result = countingSort(arr,10);
		for(int i:result){
			System.out.println(i);
		}
	}
}

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

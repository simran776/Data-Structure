/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Tree
{	private class Node{
		private Node left;
		private Node right;
		private int val;
		
		public Node(){
			this.left = null;
			this.right = null;
			this.val = -1;
		}
		public Node(int v){
			this.left = null;
			this.right = null;
			this.val = v;
		}
		public void setData(int v)
     		{
          		this.val = v;
     		}    
		public int getData()
     		{
         		return val;
     		}     
	}
	
	private Node root;
	public Tree()
     	{
        	 root = null;
     	}
     	
     	 public boolean isEmpty()
     	{
         	return root == null;
     	}
     	
     	public void insert(int data)
     	{
         	root = insert(root, data);
     	}
     /* Function to insert data recursively */
     	private Node insert(Node node, int data)
     	{
         	if (node == null)
             	node = new Node(data);
         	else
         	{
             	if (data <= node.getData())
                 	node.left = insert(node.left, data);
             	else
                 	node.right = insert(node.right, data);
         	}
         	return node;
     	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Tree bst = new Tree(); 
        	System.out.println("Binary Search Tree Test\n");
         	bst.insert(1);    
         	bst.insert(4);   
         	if(!bst.isEmpty()){
         	 	System.out.println("Binary Search Tree NOT empty!!!\n");
         	 	System.out.println("Binary Search Tree root value " + bst.root.val);
         	  	System.out.println("Binary Search Tree right child value " + bst.root.right.val);
         	}
	}
}

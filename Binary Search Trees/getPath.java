import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		
         if(root==null)
         {// {ArrayList<Integer> arr=new ArrayList<Integer>(1);
        // arr.add(data);
         return null;
        }

        if(root.data==data)
        {ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(root.data);
         return arr;
        }
        
        ArrayList<Integer> leftOutput=getPath(root.left,data);   
                    
        if(leftOutput!=null) 
        {leftOutput.add(root.data);
         return leftOutput;
        }
        
        ArrayList<Integer> rightOutput=getPath(root.right,data);   
                    
        if(rightOutput!=null) 
        {rightOutput.add(root.data);
         return rightOutput;
        }
        
        else
            return null;
        
	}
}

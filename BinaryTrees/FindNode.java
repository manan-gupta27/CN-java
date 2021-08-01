/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {
	static boolean y=false;
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        
        if(root==null){
            y=false;
            return y;
        }
        if(root.data==x){
            y=true;
            return y;
        }
        isNodePresent(root.right,x);
        if(y)
				return y;
        isNodePresent(root.left,x);
        return y;
	}

}

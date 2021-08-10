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

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
        BinaryTreeNode<Integer> oldleft;
  
        if (root == null)
            return;
  
        /* do the subtrees */
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
  
        /* duplicate this node to its left */
        oldleft = root.left;
        root.left = new BinaryTreeNode<Integer>(root.data);
        root.left.left = oldleft;
	}
	
}

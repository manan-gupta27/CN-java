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

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        
        BinaryTreeNode<Integer> temp=root.right;
        root.right=root.left;
        root.left=temp;
       
		
        
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        
	}
	
}

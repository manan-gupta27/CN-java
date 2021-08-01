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
	static boolean b=false;
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }
        int lef=depth(root.left);
        int rig=depth(root.right);
    	if(Math.abs(lef - rig) <=1 && checkBalanced(root.left) && checkBalanced(root.right) ){
            return true;
        }else{
            return false;
        }
        
        
        
        
        
	}
    public static int depth(BinaryTreeNode<Integer> root){
          if (root == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = depth(root.left);
            int rDepth = depth(root.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
    
}


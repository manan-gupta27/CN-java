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

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
        int h = height(root);
        int i;
        for (i=1; i<=h; i++){
            printCurrentLevel(root, i);
            System.out.println();
		}
    }
    
    
    public static void printCurrentLevel (BinaryTreeNode<Integer> root ,int level)
    {
        if (root == null)
            return;
        if (level == 1){
            System.out.print(root.data + " ");
        }
        else if (level > 1)
        {	
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
            
        }
        
    }
    
    
    public static int height(BinaryTreeNode<Integer> root)
    {
        if (root == null)
           return 0;
        else
        {
           
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }
	
}

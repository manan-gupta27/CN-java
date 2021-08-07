
public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        return isBST(root,min,max);
    }    
	public static boolean isBST(BinaryTreeNode<Integer> root, int min,int max) {
     if(root==null){
            return true;
        }
        if((root.data <=min)||(root.data >=max))
    			return false;
        

    boolean leftok=isBST(root.left,min,root.data);
        boolean rightok=isBST(root.right,root.data,max);
        
        
        return (leftok && rightok);
    }
	}

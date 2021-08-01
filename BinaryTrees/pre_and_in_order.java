/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = n[rfeull;
			this.right = null;
		}
	}

*/

public class Solution {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		return buildTree(preOrder , inOrder , 0 , preOrder.length-1 , 0 , inOrder.length-1);
	}
    
    public static BinaryTreeNode<Integer> buildTree(int[] pre,int[] in,int preSI,int preEI,int inSI,int inEI){
        
        if(inSI > inEI || preSI>preEI){
            return null;
        }
        
        int mid=0;
        int data=pre[preSI];
        for(int i=inSI;i<=inEI;i++){
            if(in[i]==data){
                mid=i;
                break;
            }
        }
        
        int leftPreSI = preSI + 1 ;
		int leftPreEI = leftPreSI + mid-inSI -1;
		int leftInSI = inSI;
		int leftInEI = mid-1;
		int rightPreSI = leftPreEI + 1;
		int rightPreEI = preEI;
		int rightInSI = mid + 1;
		int rightInEI = inEI;
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>( pre[preSI] );
    	root.left = buildTree(pre, in, leftPreSI, leftPreEI, leftInSI, leftInEI);
		root.right = buildTree(pre, in, rightPreSI, rightPreEI, rightInSI, rightInEI);
		return root;	
	}

}

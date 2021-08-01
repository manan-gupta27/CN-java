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

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		return buildTree(postOrder, inOrder, 0, postOrder.length-1, 0, inOrder.length -1);
	}

    
    public static BinaryTreeNode<Integer> buildTree(int[] post,int[] in,
                                                         int postSI,int postEI,int inSI,int inEI){

		if( inSI>inEI || postSI>postEI ) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>( post[postEI]  );

		int index=0;
		for(int i=inSI;i<=inEI;i++) {
			if(post[postEI] == in[i]) {
				index = i;
				break;
			}
		}

		int leftPostSI=postSI ;
		int leftPostEI= postSI + index - inSI -1;
		int rightPostSI= leftPostEI + 1 ;
		int rightPostEI= postEI-1;

		int leftInSI=inSI;
		int leftInEI=index - 1;
		int rightInSI=index + 1;
		int rightInEI=inEI;

		root.left = buildTree(post, in, leftPostSI, leftPostEI, leftInSI, leftInEI);
		root.right = buildTree(post, in, rightPostSI, rightPostEI, rightInSI, rightInEI);
		return root;
    }
}

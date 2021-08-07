public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
		
		public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
			if (root == null) {
            return;
        }
            if (k1 < root.data) {
            elementsInRangeK1K2(root.left, k1, k2);
        }
            
            if (k1 <= root.data && k2 >= root.data) {
            System.out.print(root.data + " ");
        }
 			if (k2 > root.data) {
            elementsInRangeK1K2(root.right, k1, k2);
        }
            
            
		}
		
		
	}

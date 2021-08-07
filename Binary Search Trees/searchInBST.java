public class Solution {

	


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
            return false;
        }
        boolean temp = false;
        if(root.data == k) {
            return true;
        }
        if(root.data < k) {
          temp = searchInBST(root.right, k);
        }
        else {
           temp = searchInBST(root.left, k);
        }
        return temp;
	}
}

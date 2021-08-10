public class Solution {
    
    
    static BinaryTreeNode<Integer> getLCAHelper(BinaryTreeNode<Integer> root, int a, int b) {
        if (root==null) {
            return null;
        }
        if (root.data == a || root.data == b) {
            return root;
        }
        BinaryTreeNode<Integer> leftLCA = getLCAHelper(root.left, a, b); 
        BinaryTreeNode<Integer> rightLCA = getLCAHelper(root.right, a, b);
        if ((leftLCA != null) && (rightLCA != null) ) {
            return root; 
        }
        if (leftLCA != null) {
            return leftLCA; 
        }
        return rightLCA;
    } 
    
    
    static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        BinaryTreeNode<Integer> node = getLCAHelper(root, a, b);
        if (node != null) {
            return node.data;
        } else {
            return -1;
        } 
    } 
}

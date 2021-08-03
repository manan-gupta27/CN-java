
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static int sum(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int sum= root.data;
		for(int i=0;i<root.children.size();i++) {
			sum+=root.children.get(i).data;
		}
		return sum;
	}
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		int sumRoot = sum(root);
		int max=Integer.MIN_VALUE;
		TreeNode<Integer> maxNode = null;
		for(int i=0;i<root.children.size();i++) {
			
			TreeNode<Integer> maxNode1 =maxSumNode(root.children.get(i));
			int sum = sum(maxNode1);
			if( max < sum ) {
				max = sum;
				maxNode = maxNode1;
			}
		}
		if( sumRoot > max ) {
			return root;
		}
		return maxNode;
	}
	
		
}

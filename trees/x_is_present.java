public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	static boolean b=false;
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
	
        if(root.data==x){
                b = true;
            }
		for(int i=0;i<root.children.size();i++){
            checkIfContainsX(root.children.get(i),x);
        }
        
		return b;
	}
	
}

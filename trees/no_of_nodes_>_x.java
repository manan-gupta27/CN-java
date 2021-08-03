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


    static int count = 0;
        public static int numNodeGreater(TreeNode<Integer> root,int x){
			
            if(root.data>x){
                    count++;
                }
                
            for(int i=0;i<root.children.size();i++){
                numNodeGreater(root.children.get(i),x);
                
            }
			
	return count;
	}
	
}

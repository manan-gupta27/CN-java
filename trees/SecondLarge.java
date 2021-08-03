import java.util.LinkedList;
import java.util.Queue;

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
	
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
        if(root==null){
            return null;
        }
        Queue<TreeNode<Integer>> pendingNodes=new LinkedList<TreeNode<Integer>>();
        TreeNode<Integer> max1=root;
        TreeNode<Integer> max2=root;
        max1.data=Integer.MIN_VALUE;
       max2.data=Integer.MIN_VALUE;
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> currentNode=pendingNodes.poll();
            if(max1.data<currentNode.data ){
                max2=max1;
                max1=currentNode;
                
            }
    	if(max1.data>currentNode.data && max2.data<currentNode.data){
                   max2=currentNode;
         }
            for(int i=0;i<currentNode.children.size();i++){
                pendingNodes.add(currentNode.children.get(i));
            }
            
        }
        
         return max2;
	}
	
	
}

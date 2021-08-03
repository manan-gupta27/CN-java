import java.util.Queue;
import java.util.LinkedList;
public class Solution {

	static TreeNode<Integer> res =null; 

   public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
    if (root == null) 
    {
        return root;
    }
  

    if (root.data > n)  
    {
        if (res==null || root.data<res.data)
        {
            res = root; 
        }
    }
   
    for (int i = 0; i < root.children.size(); i++) 
    {
        findNextLargerNode(root.children.get(i),n); 
    }
         
       
    return res; 
      

	}
	
}

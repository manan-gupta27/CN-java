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
import java.util.ArrayList;
import java.util.*;
 
public class Solution {

	public static void printZigZag(BinaryTreeNode<Integer> root){
        
		Stack<BinaryTreeNode<Integer>> s1 = new Stack<BinaryTreeNode<Integer>>();
        Stack<BinaryTreeNode<Integer>> s2 = new Stack<BinaryTreeNode<Integer>>();
        
		s1.push(root);
        s2.push(root);
        while(!s1.empty() && !s2.empty()){
            
            BinaryTreeNode<Integer> pp = s2.pop();
            
            while(!s1.empty()){
                if(s1.peek().left != null){
                    s2.push(s1.peek().left);             
                }
                if(s1.peek().right != null){
                    s2.push(s1.peek().right);                
                }
                System.out.print(s1.pop().data+" ");
            }
            
            System.out.println();
        
            while(!s2.empty()){
                if(s2.peek().right != null){
                    s1.push(s2.peek().right);                
                }
                if(s2.peek().left != null){
                    s1.push(s2.peek().left);                    
                }
                System.out.print(s2.pop().data+" ");
            }
            
            System.out.println();
            
            s2.push(root);
            
        }
        

	}

}

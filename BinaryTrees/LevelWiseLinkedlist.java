import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
        
        if(root==null){
            return new ArrayList<LinkedListNode<Integer>>();
        }
        ArrayList<LinkedListNode<Integer>> ans=new ArrayList<LinkedListNode<Integer>>();
        LinkedListNode<Integer> head=null;
        LinkedListNode<Integer> tail=null;
        Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<BinaryTreeNode<Integer>>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> current=pendingNodes.poll();
            if(current!=null){
                if(current.left!=null){
                    pendingNodes.add(current.left);
                }
                if(current.right!=null){
                    pendingNodes.add(current.right);
                }
                LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(current.data);
                if(head==null){
                    head=newNode;
                    tail=newNode;
                    
                }
                else{
                    tail.next=newNode;
                    tail=newNode;
                }
                
            }
            else{
                ans.add(head);
                if(!pendingNodes.isEmpty()){
                    pendingNodes.add(null);
                    head=null;
                    tail=null;
                }
            }
        }
        return ans;
        
   
	}

}

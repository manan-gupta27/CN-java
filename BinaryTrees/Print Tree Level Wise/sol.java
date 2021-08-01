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
import java.util.Queue;
import java.util.LinkedList;
public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
       // queue.add(null);
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> front=queue.poll();
            System.out.print(front.data+":");
            if (front.left!=null){
                System.out.print("L:"+front.left.data+",");
                queue.add(front.left);
            }
            else{
                System.out.print("L:-1"+",");
            }
            if (front.right!=null){
                System.out.print("R:"+front.right.data);
                queue.add(front.right);
            }
            else{
                System.out.print("R:-1");
            }
             System.out.println();
                   
         }
        
    }
}

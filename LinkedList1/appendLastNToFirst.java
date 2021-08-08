/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/
import java.io.*;
import java.util.LinkedList;

public class Solution {
   public static int LengthIterative(LinkedListNode<Integer> head){
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
    
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		    
       
		int cnt=LengthIterative(head);
        if(n==0){
            return head;
        }
		 if (cnt != n && n < cnt) {
 
            // Count of nodes to be skipped
            // from the beginning
            int skip = cnt - n;
            LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> curr = head;
 
            // Skip the nodes
            while (skip > 0) {
                prev = curr;
                curr = curr.next;
                skip--;
            }
 
            // Change the pointers
            prev.next = null;
            LinkedListNode<Integer> tempHead = head;
            head = curr;
 
            // Find the last node
            while (curr.next != null)
                curr = curr.next;
 
            // Connect it to the head
            // of the sub list
            curr.next = tempHead;
        }
 
        // Print the updated list
        return head;
	}

}

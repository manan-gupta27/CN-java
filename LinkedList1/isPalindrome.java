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
    
	 public static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> temp){  
        LinkedListNode<Integer> current = temp;  
        LinkedListNode<Integer> prevNode = null, nextNode = null;  
          
       //Swap the previous and next nodes of each node to reverse the direction of the list  
        while(current != null){  
            nextNode = current.next;  
            current.next = prevNode;  
            prevNode = current;  
            current = nextNode;  
        }  
        return prevNode;  
    }  
    
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        if (head == null)
        return true;
        
        LinkedListNode<Integer> current=head;
        int size=LengthIterative(head);
        boolean flag = true;  
        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);  
        for(int i=1; i<mid; i++){  
            current = current.next;  
        }  
        LinkedListNode<Integer> revHead = reverseList(current.next);  
          while(head != null && revHead != null){  
            if(head.data != revHead.data){  
                flag = false;  
                break;  
            }  
            head = head.next;  
            revHead = revHead.next;  
        }  
           if(flag)  
            return true; 
        else  
           return false; 
	}

}

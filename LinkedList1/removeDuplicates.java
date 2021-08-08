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

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		if(head==null || head.next==null)
            return head;
        
        LinkedListNode<Integer> t1 =head;
        LinkedListNode<Integer> t2 =head.next;
        
        
        while(t2!=null){
            if(!t1.data.equals(t2.data)){
                t1.next=t2;
                t1=t1.next;
                t2=t2.next;
            }else if(t1.data.equals(t2.data)){
            	t2=t2.next;
            }
        }
        t1.next=t2;
        return head;
	}

}

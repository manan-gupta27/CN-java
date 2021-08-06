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
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here
         if(M==0) {
	            return null;
	        }
		if (N==0)
		{
			return head;
		}
	        LinkedListNode<Integer> orginal=head;
	        LinkedListNode<Integer> temp1=head,temp2=head;
	        while(head!=null) {
	            temp1=head;
	            for(int i=1;i<M && temp1!=null;i++) {
	                temp1=temp1.next;
	            }
	            if(temp1!=null) {
	                temp2=temp1.next;
	            }
	            for(int i=1;i<N && temp2!=null;i++) {
	                temp2=temp2.next;
	            }
	            if(temp2!=null) {
	                temp2=temp2.next;
	            }
	            if(temp1!=null)
	                temp1.next=temp2;
	            head=temp2;



	        }
	        return orginal;
	}
}

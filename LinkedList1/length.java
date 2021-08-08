/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/


public class Solution {

	public static int length(LinkedListNode<Integer> head){
		LinkedListNode<Integer> i=head;
        int count=0;
        while(i != null){
            
            i=i.next;
            count++;
        }
        return count;
	}
}

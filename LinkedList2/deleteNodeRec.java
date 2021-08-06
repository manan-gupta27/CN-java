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


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        LinkedListNode<Integer> smallHead = deleteNodeRec(head.next, pos - 1);
        head.next = smallHead;
        return head;
	}

}

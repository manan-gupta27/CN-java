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

	static int c=0;
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
        if (head == null)
            return -1;
    	if(head.data==n){
            return c;
        }else{
            c++;
        }
        int f=findNodeRec(head.next,n);
        return f;
	}

}

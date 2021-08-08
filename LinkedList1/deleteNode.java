public class Solution {

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		//Your code goes here
        if (head == null)
            return head;
        
        LinkedListNode<Integer> temp=head;
        if (pos == 0)
        {
            head = temp.next;   
            return head;
        }
        
         for (int i=0; temp!=null && i<pos-1; i++)
            temp = temp.next;
        
        if (temp == null || temp.next == null)
            return head;
        temp.next = temp.next.next;
        return head;
        
	}
}

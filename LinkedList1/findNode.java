public class Solution {

	public static int findNode(LinkedListNode<Integer> head, int n) {
		LinkedListNode<Integer> temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==n){
               
                return i;
                
            }else{
                temp=temp.next;
                i++;
            }
        }
        return -1;
	}
}

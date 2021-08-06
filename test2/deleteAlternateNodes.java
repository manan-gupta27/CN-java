/* 

    Following is the class used to represent the Node of a Singly Linked List

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
*/

public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
       if(head==null){
           return ;
       }
        Node<Integer> tempNode=head;
        while(tempNode!=null && tempNode.next!=null){
            tempNode.next=tempNode.next.next;
            tempNode=tempNode.next;
        }
    }
}

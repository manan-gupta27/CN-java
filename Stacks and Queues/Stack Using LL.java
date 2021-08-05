
/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class Stack {

    //Define the data members
	 private Node head;
    private int count;

    public Stack() {
        //Implement the Constructor
        this.head = null;
        this.count = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return count;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
         if(head == null) 
        {
            return true;
        }

        return false;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode = new Node(element);

        newNode.next = this.head;
        this.head = newNode;
        this.count += 1;
    }

    public int pop() {
        //Implement the pop() function
         if(this.isEmpty()) 
        {
            //We should ideally return a StackEmptyException from here
            return -1;
        }
        int da=this.head.data;
        this.head = this.head.next;
        this.count -= 1;

        return da;
    }

    public int top() {
        //Implement the top() function
          if(this.isEmpty()) 
        {
            //We should ideally return a StackEmptyException from here
            return -1;
        }

        return this.head.data;
    }
}

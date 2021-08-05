

public class Queue {
	
	//Define the data members
Node front;
	 Node rear;
	 int size;

	public Queue() {
		//Implement the Constructor
        front = null;
		rear = null;
		size = 0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return size == 0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        Node newNode = new Node(data);
		if(rear == null){
			front = newNode;
			rear = newNode;
		}else{
			rear.next = newNode;
			rear = newNode;
		}
		size++;
    }


    public int dequeue() {
    	//Implement the dequeue() function
        if(size == 0){
			return -1;
		}	
		
		int temp = front.data;
		front = front.next;
		if(size == 1){
			rear = null;
		}
		size--;
		
		return temp;
    }


    public int front() {
    	//Implement the front() function
        if(front==null)
            return -1;
        return front.data;
    }
}

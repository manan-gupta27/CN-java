import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        
        if(input.size()==0)
            return;
        int temp=input.remove();
        
        reverseQueue(input);
        
        input.add(temp);
	}

}

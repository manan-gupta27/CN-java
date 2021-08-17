
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Collections;
public class Solution {

	public static void findMedian(int arr[])  {
        
        
        PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i : arr) {
			
			if(max.isEmpty()) {
				max.add(i);
			}
			else if( i  > max.peek() ) {
				min.add(i);
				if( (min.size() - max.size()) > 1 ) {
					int p = min.remove();
					max.add(p);
				}
			}
			else {
				max.add(i);
				if( (max.size() -min.size()) > 1  ) {
					int p = max.remove();
					min.add(p);
				}
			}
			
			if(max.size() > min.size()) {
				System.out.print(max.peek() + " ");
			}
			else if(max.size() < min.size()) {
				System.out.print(min.peek()+ " ");
			}
			else {
				System.out.print( (max.peek() + min.peek()) /2  + " ");
			}
			
			
		}
    }


}

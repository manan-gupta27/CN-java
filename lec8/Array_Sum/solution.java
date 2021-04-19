
public class Solution {
	
	public static int sum(int[] arr) {
		int sum=0;
        int size=arr.length;
        for(int i=0; i<size; i++){
            sum=sum+arr[i];
        }
        return sum;
	}
    
}

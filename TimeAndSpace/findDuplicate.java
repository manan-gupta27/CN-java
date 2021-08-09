public class Solution {

	public static int findDuplicate(int[] arr) {
        int sum1=0;
        int sum2=0;
		for(int i=0;i<arr.length;i++){
            sum1=sum1+arr[i];
        }
        for(int j=0;j<arr.length-2;j++){
            sum2=sum2+arr[j];
        }
        return sum1-sum2;
	}
}

import java.util.Arrays;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        
        int i, triplet = 0;
        
        for(i = 0; i < arr.length-2; i++) {
            //int sum = num - i;
            int j = i + 1, k = arr.length - 1;
            while(j < k) {
                if(arr[i] + arr[j] + arr[k] == num) {
                    int x = arr[j], xx = j;
                    while(j < k && arr[j] == x) {
                        j++;
                    }
                    int y = arr[k], yy = k;
                    while(k >= j && arr[k] == y) {
                        k--;
                    }
                    if(x != y) {
                        triplet += (j - xx) * (yy - k);
                    } else {
                        int temp = j - xx + yy - k - 1;
                        triplet += (temp * (temp + 1))/2;
                    }
                    //j++; k--;
                } else if(arr[i] + arr[j] + arr[k] < num) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return triplet;
	}
}

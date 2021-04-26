public class Solution {  
    public static void rotate(int[] arr, int d) {
    	int temp[] = new int[d];
        for (int i = 0; i<d; i++) {
            temp[i] = arr[i];
        }
        int n = arr.length;
        for (int i = 0; i<n-d; i++) {
                arr[i] = arr[i+d];
        }
        for (int i = n-d, j=0; i<n; i++,j++) {
            arr[i] = temp[j];
        }
    }
}

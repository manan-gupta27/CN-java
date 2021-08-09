import java.util.Arrays;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        int count=0;
        int n=arr1.length;
        int m=arr2.length;
        
        while(i<n && j<m){
            if(arr1[i]>arr2[j]){
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
                
            }
            
        }
        
	}

}

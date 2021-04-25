
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int i=0;
        int j=0;
        int k=0;
        int ans[]= new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
             }else{
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            ans[k]=arr1[i];
                i++;
                k++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
                j++;
                k++;
        }
        return ans;
    }

}

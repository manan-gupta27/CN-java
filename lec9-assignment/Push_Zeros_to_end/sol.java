public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
        int l=arr.length;
        int k=0;
    	 for(int i=0;i<arr.length;i++){
             if(arr[i]!=0){
                 int temp = arr[i];
                 arr[i]=arr[k];
                 arr[k]=temp;
                 k++;
             }
         }
    }

}

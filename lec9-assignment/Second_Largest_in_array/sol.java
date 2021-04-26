public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	int largest=0;
        int sec=Integer.MIN_VALUE;
        int n=arr.length;
        int count=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==largest){
                arr[i]=0;
                
            }
        }
        
        for(int i=0;i<n;i++){
            
             if(arr[i]>sec && arr[i]!=0){
                 sec=arr[i];
             }
        }
        return sec;
        
    }

}

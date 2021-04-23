
public class Solution { 

    public static int binarySearch(int[] arr, int x) { 
        	int size=arr.length;
            int start=0;
            int end=size-1;
            int mid;
        while(start<=end){
            
        
            
            mid=(start+end)/(2);
        
        
            if(x==arr[mid]){
                return mid;
            }else if(x<arr[mid]){
                start=0;
                end=mid-1;
                
            }else{
                start=mid+1;
                end=size-1;
                
            }
        }
        return -1;
    }

}

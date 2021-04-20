
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	int n=arr.length;
        int u=0;
        if(n%2==0){
            	for(int i=0;i<n;i=i+2){
                    int b=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=b;
                }
        }else{
            
                    for(int i=0;i<n-1;i=i+2){
                    int b=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=b;
                	}	
            
        }
    }
}

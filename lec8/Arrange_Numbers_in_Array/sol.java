public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int size=n;
        int h=1;
        
        if(n%2==0){
            int y=n;
            for(int i=0;i<n;i++){
                if(i>=0 && i<n/2){
                    arr[i]=h;
                    h=h+2;
                }else if(i>=n/2 && i<=n-1){

                    arr[i]=y;
                    y=y-2;
                }

            
        		}
        }	
        else{
            int y=n-1;
        for(int i=0;i<n;i++){
            if(i>=0 && i<=n/2){
                arr[i]=h;
            	h=h+2;
            }else if(i>n/2 && i<=n-1){
                
                arr[i]=y;
                y=y-2;
            }
            
            
        }
        }
        
    }
}

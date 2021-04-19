
public class Solution {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        int size=arr.length;
        
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                return i;
                
            }
            
        }
        return -1;
    }
}

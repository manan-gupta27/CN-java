
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	
        
        for(int i=0 ; i< arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&& i!=j) {
					return arr[i];
					
				}
			}
            
            
    }
        return 0;
}
}

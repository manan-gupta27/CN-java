
public class Solution {

    public static void sort012(int[] arr){
    	int n=arr.length;
        int nz=0;
        int nt=n-1;
        int i=0;
		while(i<=nt){
            if(arr[i]==0){
                int temp1=arr[nz];
                arr[nz]=arr[i];
                arr[i]=temp1;
                nz++;
                i++;
                // continue;
            }else if(arr[i]==2){
                int temp2=arr[nt];
                arr[nt]=arr[i];
                arr[i]=temp2;
//                 if(arr[i]==0||arr[i]==2){
                    
//                 }else{
//                     i++;
//                 }
                nt--;
                // continue;
                
            }else{
                i++;
                
            
        }
        }
    }

}

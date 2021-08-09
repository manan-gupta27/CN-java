
public class solution {

	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return splitArray(input,0,input.length-1,0,0);
	}
    public static boolean splitArray(int[] arr,int start,int end,int lsum,int rsum){
        if(start>end){
            return lsum==rsum;
        }
        if(arr[start]%5==0){
            return splitArray(arr,start+1,end,lsum+arr[start],rsum);
        }else if(arr[start]%3==0){
             return splitArray(arr,start+1,end,lsum,rsum+arr[start]);
        }else{
            return splitArray(arr,start+1,end,lsum+arr[start],rsum) || splitArray(arr,start+1,end,lsum,rsum+arr[start]);
        }
    }
	

}

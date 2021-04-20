public class Solution{  

    public static int findUnique(int[] arr){
		for(int i=0 ; i< arr.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				return arr[i];
			}
		}
		return -1;
    }
}

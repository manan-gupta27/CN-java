
public class Solution {

	public static boolean isPalindrome(String str) {
		int n=str.length();
        int i=0;
        int j=n-1;
        boolean b=true;
        if(n%2==0){
           	while(i<=(n/2)-1){
                if(str.charAt(i)==str.charAt(j)){
                    i++;
                    j--;
                }else{
                    b=false;
                    return b;
                }
            }
        }else{
            while(i<(n/2)-2){
                if(str.charAt(i)==str.charAt(j)){
                    i++;
                    j--;
                }else{
                    b=false;
                    return b;
                }
            }
        }
        return b;
	}

}

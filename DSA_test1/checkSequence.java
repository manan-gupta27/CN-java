
public class Solution {
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		
        if(a.length()<b.length()){
            return false;
        }
        int j=0;
        for(int i=0;i<a.length();i++){
            if(j<b.length() && a.charAt(i)==b.charAt(j)){
                j++;
            }
        }
        if(j==b.length()){
            return true;
        }
        return false;
	}
}

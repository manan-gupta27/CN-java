
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
        int len=str.length();
        String output=String.valueOf(str.charAt(0));
        
                if(len==0) return str;



        if(len==1){
		 return str;
		}
        
        for(int i=1;i<len;i++){

if(str.charAt(i)!=str.charAt(i-1))

output+=str.charAt(i);

}
        return output;
        

	}

}

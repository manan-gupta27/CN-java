
public class Solution {

	public static int countWords(String str) {	
        int countWords=1;
        
        if(str.length()==0)
            return 0;
        
		for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' ')
            {
                countWords++;
            }
        }
        
        return countWords;
	}

}

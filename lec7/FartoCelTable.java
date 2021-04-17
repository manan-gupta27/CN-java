public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        int c;
        int f;
       		while(start<=end){
                f=start;
                c=((f-32)*(5)/(9));
                
                System.out.println(start+"\t"+c);
                start=start+step;
            }
        
        
       // formula =  C = 5/9 x (F-32)
		
	}
}

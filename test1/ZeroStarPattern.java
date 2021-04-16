import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int l = 2*n+1;
        while(i<=n){
            int j=1;
            	while(j<=l){
                    if( j==(n+1) || j==i || i==l-j+1){
                        System.out.print("*");
                        
                    }else{
                        System.out.print(0);
                    }
                    j++;
                }
            System.out.println();
            i++;
            
        }
        
        
		
	}	


}

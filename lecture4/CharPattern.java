import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        
        while(i<=n){
            int j=1;
            char q= (char)('A'+i-1);
            while(j<=i){
                System.out.print(q);
                
                q=(char)(q+1);
                j++;
            }
            System.out.println();
            
            i++;
        }

		
	}

}

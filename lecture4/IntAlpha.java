import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        
        while(i<=n){
            int j=1;
            int k=n-i;
        while(j<=i){
               System.out.print((char)('A'+k));
                j++;
                k++;
            }
            System.out.println();
   			i++;
            
        }
	}
}

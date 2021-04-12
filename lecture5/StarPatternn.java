import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sp = new Scanner(System.in);
        int n=sp.nextInt();
        int i=1;
        while(i<=n){
            int s=1;
            while(s<=n-i){
                System.out.print(" ");
                s++;
            }
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j=1;
            
            while(j<=i-1){
                System.out.print("*");
                j++;
                
            }
            System.out.println();
            i++;
            
        }
        

		
	}

}

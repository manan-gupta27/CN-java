

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
         
        long ans=0,rem,p=1;
        while(n!=0){
            rem=n%2;
            ans=ans+rem*p;
            n=n/2;
            p=p*10;       
            
        }
        
        System.out.print(ans);
        
        
        
	}
}

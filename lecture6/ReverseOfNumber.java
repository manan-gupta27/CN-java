import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        while(n!=0){
            int rem=n%10;
            int q=n/10;
            n=q;
            rev=rev*10 + rem;
            
        }
        System.out.println(rev);
        

	}
}

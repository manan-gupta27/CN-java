import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int d=0;
        int pv=1;
        while(n!=0){
            int rem=n%10;
            int q=n/10;
            n=q;
            d=d + rem*pv;
            pv=pv*2;
        }
        System.out.println(d);
        	

	}
}

import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int og=n;
        int num=n;
        int i=1;
        int counter=0;
        int sum=0;
        while(n>0){
            int r=n%10;
            int q=n/10;
            n=q;
            counter++;
        }
        
         
        while(num>0){
            sum+=(Math.pow(num%10,counter));
            num/=10;
        }
      
        if(og==sum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

	}
}

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int a;
        if(n==0){
            System.out.println("0");
        }else{
        while(i<=n){
            int q=n/i;
            if(q==i){
                System.out.println(q);
                break;
            }
            i++;
            
        }
        }

	}
}

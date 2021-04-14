import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
      	int i=1;
        int sum=0;
        int pr=1;
        if(c==1){
            
            while(i<=n){
                sum=sum+i;
                i++;
            }
            System.out.println(sum);
            
        } else if(c==2){
           while(i<=n){
                pr=pr*i;
                i++;
            }
            System.out.println(pr);
            
        } else{
            System.out.println("-1");
            
        }
	
    
    }
}

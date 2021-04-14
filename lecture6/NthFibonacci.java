import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i;
        int fn=0;
        
        int f1=0;
        int f2=1;
        int sum=0;
        if(n==1||n==2){
            System.out.println("1");
        }else{
		for(i=1;i<n;i++){
            fn=(f1+f2);
            f1=f2;
            f2=fn;
            
        }
            System.out.println(fn);
        }

		
	}

}

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            if(i%2==0){
             sum = sum + i;
                
            }
            i++;
        }
        System.out.println(sum);
		
		
	}

}

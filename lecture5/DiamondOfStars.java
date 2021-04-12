import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
		int i=1;
        int sp=n/2;
        int st=1;
        while(i<=n){
            int j=1;
            	while(j<=sp){
                    System.out.print(" ");
                    j++;
                }
            j=1;
            	while(j<=st){
                    System.out.print("*");
                    j++;
                }
            if(i<=n/2){
                sp--;
                st+=2;
            }else{
                sp++;
                st-=2;
            }
            
            
              i++;
            System.out.println();
            
        }
    }
}

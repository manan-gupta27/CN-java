import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		int i = 1;
		int val=1;
		while (i <= n) {
            
			int j = 1;
            int space =1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
			while (j <= val) {
                
				System.out.print("*");
				
				j++;
			}
            val=val+2;
			System.out.println();
			i++;
		}

		
		
	}

}

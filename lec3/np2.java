import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	  Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while (i <= n) {
            int val=i;
			int j = 1;
            int space =1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
			while (j <= i) {
				System.out.print(val);
				val++;
				j++;
			}
			System.out.println();
			i++;
		}

		
	}

}

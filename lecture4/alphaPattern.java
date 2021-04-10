import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        char q = (char)('A');
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(q);
                j++;
            }
            System.out.println();
            q=(char)(q+1);
            i++;
        }

		
	}

}

import java.util.Scanner;

public class Solution {
     public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90)
			System.out.print("1");
		else if(ch >= 97 && ch <= 122)
			System.out.print("0");
		else{
			System.out.print("-1");
        }

    }
}

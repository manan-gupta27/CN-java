import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s =  new Scanner(System.in);
        String str = s.nextLine();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(str);
        System.out.println(avg);
		
	}

}

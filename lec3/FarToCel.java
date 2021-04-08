import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
		int e = sc.nextInt();
        int w = sc.nextInt();
        int o;
        
        while(s<=e){
            System.out.print(s+"\t");
            
            System.out.println((s - 32)*5/9);
            s=s+w;
			}

		
	}

}

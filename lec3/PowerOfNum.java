import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int r=(int)(Math.pow(x, n));
        System.out.println(r);
        
    }
}

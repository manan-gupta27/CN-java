//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int i=1;
        int o=0;
        while(i<=x){
            o=(3*(i)+2);
            if(o%4!=0){
                System.out.print(o+" ");
                }
            i++;
        }

	}
}

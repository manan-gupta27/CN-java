import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        
        
        int power=1;
        int temp=n;
        while(temp>=10){
            temp/=10;
            power*=10;
        }
        temp=n;
        int es=0;
        int os=0;
        while(power!=0){
            int d=temp/power;
            if(d%2==0){
               es=es+d; 
            }else{
                os=os+d;
            }
            temp=temp%power;
            power=power/10;
        }
       System.out.print(+es+" "+os);
        
    	
	}
}

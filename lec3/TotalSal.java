import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        double basic = s.nextDouble();
        char allow = s.next().charAt(0);
        double totalSalary; 
        double hra=((basic)*20/100);
        double da=((basic)*50/100);
		double pf=((basic)*11/100);
        
        if(allow=='A'){
            totalSalary = basic + hra + da + 1700 - pf;
            System.out.println(Math.round(totalSalary));
        }else if(allow=='B'){
            totalSalary = basic + hra + da + 1500 - pf;
            System.out.println(Math.round(totalSalary));
        }else{
            totalSalary = basic + hra + da + 1300 - pf;
            System.out.println(Math.round(totalSalary));
        }

	}
}

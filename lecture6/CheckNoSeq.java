import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int p=s.nextInt();
        int i=1;
    	boolean d=true;
        int count=0;
        while(i<=n-1){
            int c=s.nextInt();
            if(c==p){
                System.out.println("false");
                return;
            } 
            
            else if(c>p){
                if(d){
                    count++;
                    d=false;
                }
            }
            
            else{
                if(!d){
                    System.out.println("false");
                    return;
                }
            }
            i++;
            p=c;
        }
        
        if(count==1&&d==false || count==0 && d==true || count==0 && d==false) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
        
    
        
	}
}

//============= new approch   ===========================================================================================================


import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev = s.nextInt();
        int count=1;
        boolean isDec=true;
        
        while(count<n){
            
            int current  = s.nextInt();
            if(current==prev){
                System.out.println(false);
                return;
            }
            
            if(current<prev){
                if(isDec==false){
                    System.out.println(false);
                        return;
                }
                
            }
            else{
                if(isDec==true){
                    isDec=false;
                }
                
            }
            prev=current;
            
            count++;
        }
        
        System.out.println(true);
	}
}

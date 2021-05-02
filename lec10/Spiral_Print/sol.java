
public class Solution {

	public static void spiralPrint(int matrix[][]){
		int row=matrix.length;
        if(row==0){
            return;
        }
		int col=matrix[0].length;
        int t=0;
        int cs=0;
        int ce=col-1;
        int rs=0;
        int re=row-1;
    	
        while(t<row*col){
            for(int i=cs;i<=ce;i++){
                System.out.print(matrix[rs][i]+" ");
                t++;
            }
            rs++;
            for(int i=rs;i<=re;i++){
                System.out.print(matrix[i][ce]+" ");
                t++;
            }
            ce--;
            for(int i=ce;i>=cs;i--){
                System.out.print(matrix[re][i]+" ");
                t++;
            }       
            re--;
            for(int i=re;i>=rs;i--){
                System.out.print(matrix[i][cs]+" ");
                t++;
            }
            cs++;
            
            
        }
        
        
	}
}

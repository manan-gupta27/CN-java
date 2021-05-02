
public class Solution {

	public static void findLargest(int mat[][]){
		int rowsum[];
        int colsum[];
        int rs;
        int cs;
        int rn=0;
        int cn=0;
        int maxr=Integer.MIN_VALUE;
        int maxc=Integer.MIN_VALUE;
        int n=mat.length;
        if(mat.length==0)
        {
            System.out.print("row "+rn+" "+maxr);
            return;
        }
        int m=mat[0].length;
        // for case 0
        //finding max row sum
        for(int i=0;i<n;i++){
            rs=0;
            for(int j=0;j<m;j++){
                rs=rs+mat[i][j];
                
            }
            if(rs>maxr){
                    maxr=rs;
                }
        }		//finding which row has max sum
        for(int i=0;i<n;i++){
            rs=0;
            for(int j=0;j<m;j++){
                rs=rs+mat[i][j];
                
            }
            if(rs==maxr){
                   rn=i ;
                break;
                }
        }
        
        
        //finding max col sum
        for(int j=0;j<m;j++){
            cs=0;
            for(int i=0;i<n;i++){
                cs=cs+mat[i][j];
                
            }
            if(cs>maxc){
                    maxc=cs;
                }
        }		//finding which column has max sum
        for(int j=0;j<m;j++){
            cs=0;
            for(int i=0;i<n;i++){
                cs=cs+mat[i][j];
                
            }
            if(cs==maxc){
                   cn=j ;
                break;
                }
        }
        
        //printing the output
        if(maxr>=maxc){
            System.out.print("row "+rn+" "+maxr);
        }else{
            System.out.print("column "+cn+" "+maxc);
        }
        
        
	}

}

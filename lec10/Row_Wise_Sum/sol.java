
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		if(mat.length==0)
        {
            return;
        }
        int row = mat.length;
 		int col = mat[0].length;
        
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum=sum+mat[i][j];
                
            }
            System.out.print(sum+" ");
        }
        
	}

}

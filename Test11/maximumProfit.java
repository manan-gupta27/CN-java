import java.util.Arrays;
public class solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here
        Arrays.sort(budget);
        int[] profit=new int[budget.length];
        for(int i=0;i<budget.length;i++){
            profit[i]=(budget.length-i)*budget[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i:profit){
            if(max<i){
                max=i;
            }
        }
        return max;

	}

}

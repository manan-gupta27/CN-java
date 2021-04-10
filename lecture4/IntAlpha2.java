import java.util.Scanner; 
public class Solution {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    int n = s.nextInt(); 
    int currRow = 1; 
    while(currRow <= n) { 
      int currCol = 1; char ch = (char)('A' + n - currRow); 
        while(currCol <= currRow) { 
          System.out.print((char)(ch + currCol - 1)); currCol += 1; 
        } System.out.println(); currRow += 1; 
    } 
  }
}

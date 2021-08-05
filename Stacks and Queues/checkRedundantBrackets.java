import java.util.Stack;
import java.util.*;
public class Solution {

	public static boolean checkRedundantBrackets(String expression) {
	// Write your code here
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<expression.length();i++) {

			if(expression.charAt(i)==')') {
				int count =0;
				while(stack.peek()!='(' ) {
					count++;
					stack.pop();
				}
				stack.pop();
				if(count==0||count==1)
					return true;

			}
			else {
				stack.push(expression.charAt(i));
			}

		}
		return false;
        
	}
}

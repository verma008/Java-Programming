// Check if parentheses is balanced or not.

package string;
import java.util.Stack;

public class BalancedParentheses {
	
	boolean isBalanced(String str){
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='['){
				stack.push(ch);
			}				
			else {   //else if(ch==')' || ch=='}'|| ch==']') {
				if(stack.isEmpty()){
					return false;
				}
				char top=stack.pop();
				if((ch==')' && top == '(')|| (ch=='}' &&top=='{')||(ch==']' && top =='[')) {
					continue;  // Correct pair, move to the next character
				}
				return false;
			}
		}
		return stack.isEmpty(); //If stack is empty, parentheses are balanced
	}
	
	
	public static void main(String[] args) {
		 String str = "{[()]}"; 
		 String str1="{[(])}";
		 BalancedParentheses b=new BalancedParentheses();
		 boolean balanced = b.isBalanced(str);
		 boolean balanced1=b.isBalanced(str1);
		 System.out.println(str +" -> "+balanced);
		 System.out.println(str1 + " -> "+balanced1);
		 
	}
}

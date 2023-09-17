package interview;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets. s = "()"
//Open brackets must be closed in the correct order. s = "()[]{}"
//Every close bracket has a corresponding open bracket of the same type. s = "(]"

public class StringsQuestion {
	public static void main(String[] args) {
		String s = "()";
		boolean isValid = isValidBrackets(s);
		System.out.println("Is valid: " + isValid);
	}

	private static boolean isValidBrackets(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		
		for(char c: s.toCharArray()) {
			
			if(c == '(' || c == '{' || c ==  '[') {
				stack.push(c);
			}
			else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}
			else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
				
			}
			else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
				
			}else {
				return false;
			}
			
		}
		
		
		return stack.isEmpty();
	}

}

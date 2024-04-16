package stack;
 
import java.util.List;
import java.util.Stack;
 
public class reverseWords {
	
	public static String reverseString(String input) {
		
		String out = "";
		
		Stack<Character> stringStack = new Stack<>();
	
		
		for(int i = 0; i < input.length(); i++) {
			stringStack.push(input.charAt(i));
		}
		
		for(int i = 0; i < input.length(); i++) {
			out += (stringStack.pop());
		}
			
		return out;
	}
	
	
	public static void main(String[]args) {
		
		System.out.println(reverseString("Lagerregal"));
		
	
		
	}
 
}
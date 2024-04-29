package stack;
 
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
 
public class reverseWords {
	
	public static String reverseString(String input) {
		
		String out = "";
		
		LinkedList<Character> stringStack = new LinkedList<>();
	
		
		for(int i = 0; i < input.length(); i++) {
			stringStack.push(input.charAt(i));
		}
		
		//MusterLösung
//		for(char c : input.toCharArray()) {
//			stringStack.push(c);
//		}
		
		for(int i = 0; i < input.length(); i++) {
			out += (stringStack.pop());
		}
		return out;
		
		//Musterlösung
//		StringBuilder reversed = new StringBuilder();
//		while(!stringStack.isEmpty()) {
//			reversed.append(stringStack.pop());
//		}
//		
//		return reversed.toString();
			
		
	}
	
	
	public static void main(String[]args) {
		
		System.out.println(reverseString("Lagerregal"));
		
	
		
	}
 
}
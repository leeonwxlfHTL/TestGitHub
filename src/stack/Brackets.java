package stack;

import java.util.LinkedList;

public class Brackets {
	
	public static boolean checkBrackets(String input) {
		//Lehrer Lösung
		
		LinkedList<Character> stack = new LinkedList<>();
		for(char c : input.toCharArray()) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);		
			}else if(c == '}' || c == ']' || c == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				char lastOpen = stack.peek();
				
				if((c == ')' && lastOpen != '(') || 
				   (c == ']' && lastOpen != '[') ||
				   (c == '}' && lastOpen != '{')) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static boolean brackets(String input) {

		LinkedList<Character> BracketsOpen = new LinkedList<>();

		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);

			if (current == '{' || current == '[' || current == '(') {

				BracketsOpen.push(input.charAt(i));

			} else if (current == '}' || current == ']' || current == ')') {

				char opened = BracketsOpen.peek();

				switch (current) {
				case '}':
					if (opened != '{') {

						return false;
					}
					break;
				case ']':
					if (opened != '[') {
						System.out.println("a");
						return false;
					}
					break;
				case ')':
					if (opened != '(') {
						return false;
					}
					break;
				}
				BracketsOpen.pop();
			}

		}
		if (BracketsOpen.isEmpty()) {
			return true;
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		String br = "[{(})]";
		System.out.println(brackets(br));
	}

}

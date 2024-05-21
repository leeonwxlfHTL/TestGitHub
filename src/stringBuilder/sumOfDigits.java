package stringBuilder;

import java.util.LinkedList;

public class sumOfDigits {
	
	public static int calculateSumOfDigits(String input) {
		
		LinkedList<Integer> stack = new LinkedList<>();
		for(String s : input.split("")) {
			stack.push(Integer.parseInt(s));
		}
		int sum = 0;
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		return sum;
	}
	
public static int calculateSumOfDigits(long input) {
		
		LinkedList<Long> stack = new LinkedList<>();
		while (input > 0) {
		    stack.push( input % 10 );
		    input = input / 10;
			
		}
		int sum = 0;
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(calculateSumOfDigits("10938"));
		System.out.println(calculateSumOfDigits(10938));

	}

}

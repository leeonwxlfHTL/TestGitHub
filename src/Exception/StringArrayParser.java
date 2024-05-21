package Exception;

import java.util.Arrays;

public class StringArrayParser {

	public static void main(String[] args) {
		int[] test1 = parseInts("2", "34", "254");
		System.out.println(Arrays.toString(test1));
		int[] test2 = parseInts("2", "Hallo");
		System.out.println(Arrays.toString(test2));
	}		
				

	private static int parseStringToInt(String string, int defaultValue) {
		try {
			return Integer.parseInt(string);
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}

	public static int[] parseInts(String... numbers) {

		int[] intNumber = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			intNumber[i] = parseStringToInt(numbers[i], 0);
		}
		return intNumber;


	}
}

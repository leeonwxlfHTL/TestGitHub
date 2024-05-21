package Exception;

public class StringArrayParser {

	public static void main(String[] args) {

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

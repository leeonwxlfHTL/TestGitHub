package recursion;

public class Sum {
	
	public static int calculateSum(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			return n + calculateSum(n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(calculateSum(5));

	}

}

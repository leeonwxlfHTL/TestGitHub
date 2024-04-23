package recursion;

public class BinomialKoeffizient {
	
	public static int calculateBinomialKoeffizient(int n, int k) {
		if(k == 0 || k ==n) {
			return 1;
		}
		else {
			return calculateBinomialKoeffizient(n-1, k-1) + calculateBinomialKoeffizient(n-1, k);
		}
	}

	public static void main(String[] args) {
		System.out.println(calculateBinomialKoeffizient(4,2));

	}

}

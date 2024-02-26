package Arrays;

public class Aufgabe1 {

	
	
	
	public static int count5PercentJumps(int[] gains) {
		if(gains == null) {
			System.err.println("Leeres Array");
			return -1;
		}
		else {
			int sum = 0;
			for(int i = 0; i < (gains.length -1); i++) {
				double a = gains[i];
				double b = gains[i+1];
				
				if(b > (a * 1.05)) {
					sum += 1;
				}
				
			}
			return sum;
		}
		
	}
	
	public static void main(String[] args) {
		int[] dailyGains = {1000, 2000, 500, 9000, 9010};
		System.out.println("5% Jumps: " + count5PercentJumps(dailyGains));
	}
}

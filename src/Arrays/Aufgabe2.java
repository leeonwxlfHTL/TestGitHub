package Arrays;

public class Aufgabe2 {

	public static void main(String[] args) {
		String[] signs = {"F","DO","MOS","MOS","MOS","MOS","WES"};
		System.out.println(isProbablyApproching(signs));
	}

	public static boolean isProbablyApproching(String[] signs) {
		if(signs == null) {
			System.err.println("Leeres Array");
			return false;
		}
		else {
			for(int i = 0; i < signs.length; i++) {
				if(signs[i]==null) {
					System.err.println("Leeres Array");
					return false;
				}
				
			}
			for(int i = 0; i < (signs.length-3); i++) {
				if(signs[i].equals(signs[i+1]) && signs[i+1].equals(signs[i+2]) && signs[i+2].equals(signs[i+3])) {
					return true;
				}
				
			}
			
		}
		return false;
	}

}

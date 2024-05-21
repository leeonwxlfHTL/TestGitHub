package stringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pwdcheck {

	public static boolean isGoodPassword(String input) {
		
		Pattern sonderZeichen = Pattern.compile("[!§$%&/()={}?,.;:_*+~'#`´@€|><µ^°-]");
		Pattern kleinBuchstabe = Pattern.compile("[a-z]");
		Pattern großBuchstabe = Pattern.compile("[A-Z]");
		Pattern ziffer = Pattern.compile("\\d+");
		
		Matcher kB = kleinBuchstabe.matcher(input);
		Matcher gB = großBuchstabe.matcher(input);
		Matcher zi = ziffer.matcher(input);
		Matcher sZ = sonderZeichen.matcher(input);
			
			boolean szfound = false;
			boolean kbfound = false;
			boolean gbfound = false;
			boolean zifound = false;
			boolean lengthAccepted = false;
			if(sZ.find()) { //Überprüft Sonderzeichen
				szfound = true;
			}
			if(kB.find()) {		//Überprüft kleine Buchstaben
				kbfound = true;
			}
			if(gB.find()) {		//Überprüft große Buchstaben
				gbfound = true;
			}
			if(zi.find()) {		//Überprüft Ziffern
				zifound = true;
			}
			if(input.length()>8) {
				lengthAccepted = true;
			}
			
			if(szfound && kbfound && gbfound && zifound && lengthAccepted) {
				return true;
			}
			return false;

	}

	public static void main(String[] args) {
		System.out.println(isGoodPassword("!Passw123"));
	}

}

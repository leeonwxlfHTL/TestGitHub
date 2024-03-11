package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KommentareFiltern {
	
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("A1");
		a.add("A2");
		a.add("A3");
		a.add("A4");
		a.add("B1");
		a.add("B2");
		a.add("B3");
		a.add("B4");
		a.add("C1");
		a.add("C2");
		a.add("C3");
		a.add("C4");
		
		reduceToComments(a);
		ausgabeArrayList(a);
	}
	
	public static void reduceToComments(List<String> lines) {
		for(int i = 0; i< lines.size(); i++) {
			
			lines.remove(i);
			lines.remove(i);
			lines.remove(i);
		}
	}
	
	public static void ausgabeArrayList(ArrayList<String> liste) {
        // Iteriere über jedes Element in der ArrayList
        for (String element : liste) {
            System.out.println(element);
        }
    }

}

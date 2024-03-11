package Lists;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

	public static void main(String[] args) {
		List<Double> a = new ArrayList<Double>();
		
		a.add((double) 1);
		a.add((double) 2);
		a.add((double) 1);
		a.add((double) 3);
		a.add((double) 2);
		
		
		ausgabeList(trimNonGrowingNumbers(a));
	}
	
	public static List<Double> trimNonGrowingNumbers(List<Double> lines) {
		for(int i = 0; i< lines.size(); i++) {
			if(i != 0 && lines.get(i) < lines.get(i-1)) {
				lines.remove(i);
			}
		}
		return lines;
		}
	
	
	public static void ausgabeList(List<Double> liste) {
       
        for (double element : liste) {
            System.out.println(element);
        }
	}
}

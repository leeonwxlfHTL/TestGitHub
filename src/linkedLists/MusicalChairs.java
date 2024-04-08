package linkedLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MusicalChairs {

	private List<String> names;
	
	public MusicalChairs(String... names) {
		if(names.length !=0) {
			this.names = new LinkedList<String>(Arrays.asList(names));
		}
	}
	
	public String toString() {
		Iterator<String> itr = this.names.iterator();
		String tmp = "";
		while(itr.hasNext()) {
			tmp += itr.next() + ", ";
		}
		return tmp;
	}
	
	public void rotate(int distance) {
		Collections.rotate(this.names, distance);
	}
	public void rotateAndRemoveLast(int distance) {
		if(!this.names.isEmpty()) {
			rotate(distance);
			((LinkedList<String>) this.names).removeLast();
		}
	}
	
	public String play() {
		if(!this.names.isEmpty()) {
			while(this.names.size() > 1) {
				int randomDistance = ThreadLocalRandom.current().nextInt();
				rotateAndRemoveLast(randomDistance);
				System.out.println(this.names);
			}
		}
		// einzigen Spieler in der Liste zurückgeben
		//in diesem Fall
		return this.names.get(0);
	}

}

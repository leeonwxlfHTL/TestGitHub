package linkedLists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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

}

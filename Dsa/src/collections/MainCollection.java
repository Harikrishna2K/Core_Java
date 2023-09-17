package collections;

/**
 * Working of iterator and iterable interface
 */

import java.util.Iterator;

public class MainCollection {

	public static void main(String[] args) {
		
		GenericList<Integer> gc = new GenericList<Integer>();
		gc.add(100);
		gc.add(200);
		gc.add(300);
		
		Iterator<Integer> itr = gc.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}

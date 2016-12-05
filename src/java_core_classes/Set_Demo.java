package java_core_classes;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Demo {
	// demo set in java
	public void demoSet() {
		HashSet<Integer> hs = new HashSet<Integer>();
		boolean test;
		// add object to set
		hs.add(1);
		hs.add(2);
		hs.add(5);
		System.out.println(hs);
		// clear set
		// hs.clear();
		// System.out.println(hs);
		// boolean contains( object o) - return true if o into set else false
		test = hs.contains(2);
		System.out.println(test);
		// isEmpty( ) - return true if set is empty else false
		test = hs.isEmpty();
		System.out.println(test);
		// Iterator iterator( ) - return a Iterator object of set
		Iterator it = hs.iterator();
		System.out.println(it);
		// remove object of set
		hs.remove(2);
		System.out.println(hs);
		// return size of set
		System.out.println(hs.size());

	}
}

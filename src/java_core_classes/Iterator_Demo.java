package java_core_classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Demo {
	// demo iterator in java
	public void demoIterrator() {
		List list = new ArrayList();
		// add element to list
		list.add("A");
		list.add("B");
		list.add("C");
		Iterator itt = list.iterator();
		while (itt.hasNext()) {
			Object element = itt.next();
			System.out.print(element + " ");
		}
	}
}

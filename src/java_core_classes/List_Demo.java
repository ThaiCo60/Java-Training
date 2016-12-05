package java_core_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Demo {

	// demo list here
	public void demoList() {
		List list = new ArrayList();
		// add element to list
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		// add another list to list in index
		List child = new ArrayList();
		child.add(1);
		child.add(2);
		child.add(3);
		list.addAll(2, child);
		System.out.println(list);
		// get element of list by index
		System.out.println(list.get(1));
		// get index of object in list
		int index = list.indexOf("C");
		System.out.println(index);
		// return a list Iterator
		ListIterator li = list.listIterator();
		while (li.hasNext()) {
			Object element = li.next();
			System.out.print(element + " - ");
		}
		System.out.println("");
		// return a Iterator at index
		ListIterator li2 = list.listIterator(1);
		while (li2.hasNext()) {
			Object element = li2.next();
			System.out.print(element + " - ");
		}
		System.out.println("");
		// remove element by index
		list.remove(1);
		System.out.println(list);
		// set object to index
		list.set(2, "D");
		System.out.println(list);
		// return sublist to index form index (index->index-1)
		List subList = list.subList(1, 3);
		System.out.println(subList);
	}
}

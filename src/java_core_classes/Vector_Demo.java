package java_core_classes;

import java.util.Vector;

public class Vector_Demo {
	// demo vector in java
	public void demoVector() {

		Vector vector = new Vector();
		// add element
		vector.addElement(1);
		vector.addElement(2);
		vector.addElement(5);
		System.out.println(vector);
		vector.add(2, 4);
		System.out.println(vector);
		// check capacity of vector
		System.out.println(vector.capacity());

	}
}

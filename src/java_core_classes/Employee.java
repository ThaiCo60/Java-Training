package java_core_classes;

import java.io.Serializable;

public class Employee implements Serializable {
	String id;
	String name;
	String address;
	int age;
	
	//contructor
	public Employee(String Id, String Name, String Address, int Age) {
		this.id = Id;
		this.name = Name;
		this.address = Address;
		this.age = Age;
	}
}

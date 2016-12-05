package java_core_classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable_Demo {

	// demo Serrializable
	public void demo_Serializable() throws IOException {
		FileOutputStream out = new FileOutputStream("./Employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		String id = "001";
		String name = "Join Hard";
		String address = "123, abc";
		int age = 26;
		Employee em = new Employee(id, name, address, age);
		try {
			oos.writeObject(em);
			out.close();
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// demo deserializable
	public Employee demo_Deserializable() throws IOException {
		Employee e = null;
		FileInputStream in = new FileInputStream("./Employee.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		try {
			e = (Employee) ois.readObject();

		} catch (Exception e1) {
			// TODO: handle exception
		}
		in.close();
		ois.close();
		return e;
	}

	// out put information
	public void Output_inf() throws IOException {
		Employee e = demo_Deserializable();
		System.out.print(e.id);
		System.out.print(" - " + e.name);
		System.out.print(" - " + e.address);
		System.out.print(" - " + e.age);
	}

}

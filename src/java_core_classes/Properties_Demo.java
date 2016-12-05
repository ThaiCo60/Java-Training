package java_core_classes;

import java.io.PrintStream;
import java.util.Properties;

import javax.print.attribute.standard.PrinterStateReason;

public class Properties_Demo {
	// demo properties in java
	public void demoProperties() {
		Properties pro = new Properties();
		// put element to properties
		pro.put("name", "Join hard");
		pro.put("age", "24");
		pro.put("position", "dev");
		System.out.println(pro);
		// String getProperty(String key) - return value of key
		System.out.println(pro.getProperty("name"));
		// String getProperty(String key, String defaultProperty) - return value
		// of key, if key not have return defaultProperties
		System.out.println(pro.getProperty("name", "admin"));
		System.out.println(pro.getProperty("names", "admin"));
		// void list(PrintStream streamOut)

	}
}

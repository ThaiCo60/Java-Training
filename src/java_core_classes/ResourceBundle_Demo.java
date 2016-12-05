package java_core_classes;

import java.util.ResourceBundle;

public class ResourceBundle_Demo {
	// demo ResourceBundle in java
	public void demoResourceBundle() {
		ResourceBundle bundle = ResourceBundle.getBundle("appClientModule.myBundle");
		System.out.println(bundle.getObject("name"));

	}
}

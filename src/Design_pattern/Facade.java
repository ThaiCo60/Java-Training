package Design_pattern;

import java.io.IOException;

import java_core_classes.Date_Demo;
import java_core_classes.Enum_Demo;
import java_core_classes.FileIn_In_Out_Demo;
import java_core_classes.Iterator_Demo;
import java_core_classes.List_Demo;
import java_core_classes.Properties_Demo;
import java_core_classes.ResourceBundle_Demo;
import java_core_classes.Serializable_Demo;
import java_core_classes.Set_Demo;
import java_core_classes.StringBuffer_Demo;
import java_core_classes.StringBuilder_Demo;
import java_core_classes.Vector_Demo;

public class Facade {

	// Demo list here
	public void Demo_List() {
		List_Demo list = new List_Demo();
		list.demoList();
	}

	// Demo set here
	public void Demo_Set() {
		Set_Demo set = new Set_Demo();
		set.demoSet();
	}

	// Demo date here
	public void Demo_Date() {
		Date_Demo date = new Date_Demo();
		date.demoDate();
	}

	// Demo vector here
	public void Demo_Vector() {
		Vector_Demo vector = new Vector_Demo();
		vector.demoVector();
	}

	// Demo properties here
	public void Demo_Properties() {
		Properties_Demo pro = new Properties_Demo();
		pro.demoProperties();
	}

	// Demo ResourceBundle here
	public void Demo_ResourceBundle() {
		ResourceBundle_Demo bundle = new ResourceBundle_Demo();
		bundle.demoResourceBundle();
	}

	// Demo enum here
	public void Demo_Enum() {
		Enum_Demo enu = new Enum_Demo();
		enu.demoEnum();
	}

	// Demo iterator here
	public void Demo_Iterrator() {
		Iterator_Demo itt = new Iterator_Demo();
		itt.demoIterrator();
	}

	// Demo file input output stream
	public void Demo_IO() {
		FileIn_In_Out_Demo io = new FileIn_In_Out_Demo();
		try {
			// Using Files
			io.read_write_file_using_Files();
			// Using buffer
			io.read_write_file_using_buffer();
			// demo File
			io.demoFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Demo Serializable and deserializable here
	public void Demo_Serializable_and_Deserializable() {
		Serializable_Demo ser = new Serializable_Demo();
		try {
			ser.demo_Serializable();
			ser.Output_inf();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Demo StringBuffer here
	public void Demo_StringBuffer() {
		StringBuffer_Demo sb = new StringBuffer_Demo();
		sb.demoStringBuufer();
	}

	// Demo StringBuilder here
	public void Demo_StringBuilder() {
		StringBuilder_Demo sb = new StringBuilder_Demo();
		sb.demoStringBuilder();
	}

}

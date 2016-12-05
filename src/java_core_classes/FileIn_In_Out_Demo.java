package java_core_classes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileIn_In_Out_Demo {
	
	//demo File
	String file_name = "D:\\Hoc tap\\eclipse project\\DemoJavaCore\\appClientModule\\META-INF\\test.txt";
	public void demoFile() throws IOException {
		//create new file
		File fi = new File(file_name);
		if(!fi.exists()) {			
			fi.createNewFile();
			System.out.println("create file surcess");
		}
		//fet path file
		System.out.println(fi.getPath());
		//delete file
//		if(fi.exists()) {
//			fi.delete();
//			System.out.println("delete file surcess");
//		}
		
	}
	
	// demo FileInputSteam in java
	String fileName_in = "D:\\Hoc tap\\eclipse project\\DemoJavaCore\\appClientModule\\META-INF\\input.txt";
	String fileName_out = "D:\\Hoc tap\\eclipse project\\DemoJavaCore\\appClientModule\\META-INF\\output.txt";

	// read and write file using Files
	public void read_write_file_using_Files() throws IOException {
		Path path = Paths.get(fileName_in);
		Path path_out = Paths.get(fileName_out);
		//read file
		List<String> listLine = Files.readAllLines(path, StandardCharsets.UTF_8);
		for (String line : listLine) {
			System.out.println(line);
		}
		//write file
		byte[] bytes = Files.readAllBytes(path);
		Files.write(path_out, bytes, StandardOpenOption.APPEND);
	}
	
	//read and write using BufferedInputStream, BufferedOutputStream
	public void read_write_file_using_buffer() throws IOException {
		File file = new File(fileName_in);		
		FileInputStream fis = new FileInputStream(file);		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		File file2 = new File(fileName_out);
		FileOutputStream fos = new FileOutputStream(file2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		DataInputStream dis = new DataInputStream(bis);
		DataOutputStream das = new DataOutputStream(bos);
		while(dis.available()!=0) {
			System.out.println(dis.readLine());
			das.writeByte(dis.read());
		}
		das.close();
		dis.close();
		
	}
	
	
	public void demoInOutPut() throws IOException {
		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;
		try {
			fileIn = new FileInputStream(
					"D:\\Hoc tap\\eclipse project\\DemoJavaCore\\appClientModule\\META-INF\\input.txt");
			fileOut = new FileOutputStream(
					"D:\\Hoc tap\\eclipse project\\DemoJavaCore\\appClientModule\\META-INF\\output.txt");
			int c;
			try {
				while ((c = fileIn.read()) != -1) {
					System.out.println(fileIn.read());
					fileOut.write(c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} finally {
			if (fileIn != null) {
				fileIn.close();
			}
			if (fileOut != null) {
				fileOut.close();
			}

		}

	}
}

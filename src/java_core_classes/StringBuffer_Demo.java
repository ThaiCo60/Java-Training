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

public class StringBuffer_Demo {

	// demo String buffer
	public void demoStringBuufer() {
		StringBuffer sb = new StringBuffer("i love java");
		System.out.println(sb);
		
		// append(String s) - append s to sb
		sb.append(" and i try to do this");
		System.out.println(sb);
		// insert(int offset, String s) - insert s to sb at offset index
		sb.insert(2, "insert here");
		System.out.println(sb);
		// replace(int startIndex, int endIndex, String str) - replace form startIndex to endIndex by str
		sb.replace(2, 13, " ");
		System.out.println(sb);
		// delete(int startIndex, int endIndex) - delete form startIndex to endIndex
		sb.delete(2, 3);
		System.out.println(sb);
		
		
	}
}

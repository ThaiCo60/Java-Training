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

public class StringBuilder_Demo {

	// demo String Builder
	public void demoStringBuilder() {
		StringBuilder sb = new StringBuilder("java, i love you");
		// append(String s) - append s to sb
		System.out.println(sb);
		sb.append(" so much");
		System.out.println(sb);
		// insert(int offset, String s) - insert s to sb ai offset index
		sb.insert(5, " insert here");
		System.out.println(sb);
		// replace(int startIndex, int endIndex, String str) - replace form startindex to endIndex by str
		sb.replace(5, 12, "");
		System.out.println(sb);
		// delete(int startIndex, int endIndex) - delete form startIndex to endIndex
		sb.delete(5, 10);
		System.out.println(sb);
		// charAt(int index) - return char at index
		System.out.println(sb.charAt(4));
		// substring(int beginIndex) - return substring form beginIndex
		System.out.println(sb.substring(5));
	}
}

package java_core_classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Demo {
	// demo date in java
	public void demoDate() {
		Date date = new Date();
		boolean test;
		Date d = new Date(117, 1, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		// boolean after(Date date) - return true if date after date input
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(d));
		test = date.after(d);
		System.out.println(test);
		// boolean before(Date date) - return true if date before date input
		test = date.before(d);
		System.out.println(test);
		// Object clone( ) - clone date
		System.out.println(date.clone());
		// int compareTo(Date date) - return 0 if same, return int compare two
		// date
		int res = date.compareTo(d);
		System.out.println(res);
		// int compareTo(Object obj) - same
		System.out.println(date.compareTo(new Date(117, 1, 1)));
		// boolean equals(Object date) - return true if date same date input
		// else false
		test = date.equals(d);
		System.out.println(test);
		// long getTime( ) - return millisec from 1-1-1970
		System.out.println(date.getTime());
		// int hashCode( ) - return hash code of date
		System.out.println(date.hashCode());
		// void setTime(long time)- set time to date
		date.setTime(99999999);
		System.out.println(date);
		// String toString( ) - convert date to string
		date.toString();
		System.out.println(date);

	}
}

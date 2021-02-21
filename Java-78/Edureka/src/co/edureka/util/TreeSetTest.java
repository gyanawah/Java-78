package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> courses = new TreeSet<>();
		System.out.println(courses + " | Size = "+courses.size());
		
		System.out.println(courses.add("Java")); //true
		System.out.println(courses.add("Java")); //false
		System.out.println(courses.add("Python")); //true
		courses.add("R Language");
		courses.add("Microsoft .NET");
		courses.add("Android");
		System.out.println(courses + " | Size = "+courses.size());
		
		courses.add(null);
		System.out.println(courses + " | Size = "+courses.size());		
	}
}

package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> courses = new LinkedHashSet<String>();
		
		System.out.println(courses + " | Size = "+courses.size());
		
		System.out.println(courses.add("Java")); //true
		System.out.println(courses.add("Java")); //false
		System.out.println(courses.add("Python")); //true
		courses.add("R Language");
		courses.add("Microsoft .NET");
		courses.add("Android");
		System.out.println(courses + " | Size = "+courses.size());

	}

}

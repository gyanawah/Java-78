package co.edureka.util;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> courses = new HashSet<>();
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

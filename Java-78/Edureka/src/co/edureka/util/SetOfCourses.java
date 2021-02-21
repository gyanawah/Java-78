package co.edureka.util;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOfCourses {

	public static void main(String[] args) {
		Set<String> courses = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		String moreToAdd = "Y";
		while(moreToAdd.equalsIgnoreCase("Y")) {
			System.out.print("enter course name: ");
			String cname = sc.next();
			boolean isAdded = courses.add(cname);
			
			if(!isAdded)
				System.out.println(cname+" is already in List");
			
			System.out.print("Any more course to add: ");
			moreToAdd = sc.next();
		}
		
		System.out.println("Courses @ edureka = "+ courses);
	}
}

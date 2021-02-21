package co.edureka.util;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ListMethods {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+ " | Size = "+names.size());
		System.out.println("Is List Empty = "+ names.isEmpty());
		
		names.add("Sunil");
		System.out.println("Is List Empty = "+ names.isEmpty());
		names.add("Sunil");
		names.add("Anil");
		names.add("Praveen");
		names.add("Sanjay");
		names.add("Sachin");
		names.add("Charles");
		names.add("Sunil");
		System.out.println(names+ " | Size = "+names.size());		
		
		System.out.println("Is Sunil in List = "+ names.contains("Sunil"));
		
		names.add(1, "Chris");
		System.out.println(names+ " | Size = "+names.size());
		
		names.set(3, "edureka"); //to replace an element
		System.out.println(names+ " | Size = "+names.size());
		
		System.out.println("Element at index 0 = "+ names.get(0));
		
		System.out.println("Index of \"Sunil\" = "+ names.indexOf("Sunil"));
		System.out.println("Last Index of \"Sunil\" = "+ names.lastIndexOf("Sunil"));
		
		long count = names.stream().filter((name)->name.equals("Sunil")).count();
		System.out.println("No of People with name of \"Sunil\" = "+ count);
		
		System.out.println("Remove Sunil = "+ names.remove("Sunil")); //true
		System.out.println("Remove Sunil = "+ names.remove(1)); //Sunil
		System.out.println(names+ " | Size = "+names.size());
		
		names.stream().forEach(name->System.out.println(name));
	}
}

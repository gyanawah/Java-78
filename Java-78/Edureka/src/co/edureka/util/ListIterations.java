package co.edureka.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> marks = Arrays.asList(92,86,93,84,76,99);
		System.out.println(marks);
		/*
		Collections.sort(marks);
		System.out.println(marks);
		*/
		
		iterateList1(marks);
		Thread.sleep(1500);

		iterateList2(marks);
		Thread.sleep(1500);
		
		iterateList3(marks);		
		Thread.sleep(1500);	
		
		iterateList4(marks);
		Thread.sleep(1500);
		
		iterateList5(marks);
		Thread.sleep(1500);			
	}

	static void iterateList1(List<Integer> marks) {
		System.out.println("1)List iteration using a for loop with get() - only for java.util.List");
		for(int i=0;i<marks.size();i++) {
			Integer n = marks.get(i);
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iterateList2(List<Integer> marks) {
		System.out.println("2)List iteration using enhanced for loop");
		for(Integer n : marks) {			
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iterateList3(List<Integer> marks) {
		System.out.println("3)List iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iterateList4(List<Integer> marks) {
		System.out.println("4)List iteration using java.util.ListIterator - only for java.util.List");
		ListIterator<Integer> it = marks.listIterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n+"   ");
		}		
		System.out.println("\n");
	}	
	
	static void iterateList5(List<Integer> marks) {
		System.out.println("5)List Iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}	
}

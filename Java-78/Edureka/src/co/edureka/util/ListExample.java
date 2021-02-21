package co.edureka.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = Arrays.asList(92,86,93,84,76,99);
		ArrayList<Integer> marks = new ArrayList<>(list);
		
		System.out.println(marks);
		
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
			Thread.sleep(1500);
			it.remove();
		}
		System.out.println("\n"+marks);
	}

}

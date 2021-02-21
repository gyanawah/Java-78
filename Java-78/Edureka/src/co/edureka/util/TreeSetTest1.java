package co.edureka.util;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args) {
		TreeSet<Integer> marks = new TreeSet<Integer>(new MyComparator());
		marks.add(99);
		marks.add(76);
		marks.add(85);
		marks.add(91);
		marks.add(100);
		marks.add(82);
		
		System.out.println(marks);
		//System.out.println(marks.descendingSet());
	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println(o1+" - "+o2);
		if(o1 > o2)
			return -1;
		else if(o1 < o2)
			return 1;
		else
			return 0;
	}
	
}
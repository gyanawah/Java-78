package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Float> bank = new TreeMap<String,Float>();
		
		System.out.println(bank.put("Sunil",25000f)); //null
		System.out.println(bank.put("Sunil",11500.50f)); //25000.0
		System.out.println(bank.put("Anil",11500.50f)); //null
		bank.put("Sachin",4500f);
		bank.put("Naveen", 87500f);
		bank.put("Chris",22500f);
		System.out.println(bank);

	}

}

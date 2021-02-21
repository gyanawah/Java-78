package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BankTest {

	public static void main(String[] args) {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Sunil",25000f)); //null
		System.out.println(bank.put("Sunil",11500.50f)); //25000.0
		System.out.println(bank.put("Anil",11500.50f)); //null
		
		bank.put("Sachin",4500f);
		bank.put("Naveen", 87500f);
		bank.put("Chris",22500f);
		System.out.println(bank);
		
		System.out.println("-------------------------------------");
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of \"Sunil\" = " + bal);
		bal += 1250.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		System.out.println("-------------------------------------");
		
		System.out.print("A/C Holders  :  ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name+" | ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Float> entry = it.next();
			String name = entry.getKey();
			bal = entry.getValue();
			System.out.println(name + " --> " + bal);
		}
		System.out.println("-------------------------------------");
	}
}

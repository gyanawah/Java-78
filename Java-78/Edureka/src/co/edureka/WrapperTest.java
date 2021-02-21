package co.edureka;

public class WrapperTest {
	
	public static void main(String[] args) {		
		Integer n1 = new Integer(25);
		Integer n2 = new Integer("25");
		System.out.println(n1 + " - "+n2);
		
		Integer n3 = Integer.valueOf(25);
		Integer n4 = Integer.valueOf("25");
		System.out.println(n3 + " - " + n4);
		
		Character c1 = new Character('A');
		System.out.println(c1);
		
		/*--- method to get the primitive numeric value from Wrapper object --- */
		byte b = n1.byteValue();
		short s = n1 .shortValue();
		int n = n1.intValue();
		long l = n1.longValue();
		
		float f = n1.floatValue();
		double d = n1.doubleValue();
		
		System.out.println(b+" - "+s+" - "+n+" - "+l);
		System.out.println(f+" - "+d);
		
		int x1 = 26; //primitive data
		Integer x2 = x1; //auto boxing
		int x3 = x2; //un-boxing
		System.out.println(x1+" - "+x2+" - "+x3);
		
		Integer data1 = Integer.valueOf(10);
		Integer data2 = Integer.valueOf(20);
		Integer data3 = data1 + data2; //un-boxed -> adding -> boxed
		System.out.println("Sum = " + data3);
	}
}

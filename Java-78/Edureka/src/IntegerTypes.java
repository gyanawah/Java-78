
public class IntegerTypes {

	public static void main(String[] args) {
		//byte b = 128; //cannot convert from int to byte
		byte b = 127;
		System.out.println(b);
		
		int sal = 2500;
		System.out.println("My Salary = " + sal);
		
		long pop = 2147483648L;
		System.out.println("World Population = " + pop);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int n = (int)12L;
		System.out.println(n);		
	}
}

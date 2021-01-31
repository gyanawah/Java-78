
public class RealTypes {

	public static void main(String[] args) {
		//float sal = 2500.50; //Type mismatch: cannot convert from double to float
		//float sal = 2500.50f;
		//float sal = 2500.50F;
		float sal = (float)2500.50;
		System.out.println("My Salary = " + sal);
		
		double data = 2500.55;
		System.out.println(data);
		
		System.out.println(Integer.toHexString(65));
	}
}

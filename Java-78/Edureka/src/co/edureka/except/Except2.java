package co.edureka.except;

public class Except2 {

	public static void main(String[] args) {
		System.out.println("No of cmd args = "+ args.length);
		for(String arg : args) {
			System.out.println(arg);
		}
		System.out.println("-------------------------------");
		
		String str = "625"; 
		System.out.println(str + 25);
		
		//parsing is the process of converting data in String form to any numeric type
		int n = Integer.parseInt(str);
		System.out.println(n+25);
		
		n = Integer.parseInt("A");
		System.out.println(n); //java.lang.NumberFormatException
	}
}

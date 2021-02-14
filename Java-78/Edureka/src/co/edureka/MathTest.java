package co.edureka;

import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(E);
		out.println(PI);
		
		out.println(abs(-10));
		System.out.println(sqrt(25));
		System.out.println(sin(0));
		System.out.println(cos(0));
		
		System.out.println(min(10,20));
		System.out.println(max(10,20));
		
		System.out.println(floor(10.9)); //10.0
		System.out.println(ceil(10.1)); //11.0
		
		double rand = random(); //will return a value between 0 and 1
		System.out.println(rand);
		System.out.println("OTP= " + (int)(rand*10000));
	}
}

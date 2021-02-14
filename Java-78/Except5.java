class Except5
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int res = x / y;
			System.out.println(x + " / " + y + " = " + res); 
		}
		catch(Exception ex){
			System.out.println("Is ArithmeticException = " + (ex instanceof ArithmeticException));
			System.out.println("Is ArrayIndexOutOfBoundsException = " + (ex instanceof ArrayIndexOutOfBoundsException));
			System.out.println("Is NumberFormatException = " + (ex instanceof NumberFormatException));

			System.out.println("Exception Occured!");
			System.out.println("Message = " + ex.getMessage());
			System.out.println("toString() = " + ex.toString());//object_type with message
			ex.printStackTrace(); //toString() + callstack

			if(ex instanceof ArrayIndexOutOfBoundsException){
				System.out.println("**** Sufficient Arguments are not Provided ****");
			}
		}
		System.out.println("--- done ---");
	}
}

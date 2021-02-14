package co.edureka.except;
class Calculator{
  public int calc(int x, int y) {
	  if(y == 0) {
		  //ArithmeticException ex = new ArithmeticException();
		  ArithmeticException ex = new ArithmeticException("cannot divide an integer by zero!");
		  throw ex;
	  }
	  return x/y;
  }
}

public class ThrowTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		try {
			System.out.println("Result = " + cal.calc(10, 0));
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
	}
}
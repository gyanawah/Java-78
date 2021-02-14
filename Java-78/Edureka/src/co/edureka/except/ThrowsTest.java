package co.edureka.except;
class MyClass{
	void display() throws InterruptedException {
		System.out.println("display logic");
	}
}
public class ThrowsTest {
	public static void main(String[] args) throws InterruptedException {
		MyClass obj = new MyClass();
		try {
			obj.display();
		}catch(Exception ex) {}
		
		obj.display();
	}
}

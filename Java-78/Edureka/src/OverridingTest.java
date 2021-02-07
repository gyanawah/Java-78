class A1{
	int a=10, b=20;
	void display() {
		System.out.println("Inside class A1 ---> "+ a+" | "+b);
	}
}

class B1 extends A1{
	int a=11, b=22;
	@Override //annotation - metadata
	void display() {
		System.out.println("Inside class B1 ---> "+super.a+" | "+super.b+" | "+this.a+" | "+b);
		super.display();
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		B1 obj = new B1();
		System.out.println(obj.a+" | "+obj.b);
		obj.display();
	}
}

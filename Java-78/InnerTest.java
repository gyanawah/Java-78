class Outer{
	int outer_x = 10;
	void display(){
		System.out.println("Inside method of Outer class ...");
		System.out.println(outer_x);
		Inner innerObj = new Inner();
		innerObj.display();
	}
	class Inner	{
		int inner_x = 20;

		void display(){
			System.out.println("Inside method of Inner class ...");
			System.out.println(outer_x+ " - "+inner_x);
		}
	}
}

class InnerTest 
{
	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.display();
		System.out.println("-----------------------------");

		Outer.Inner innObj = obj.new Inner();
		innObj.display();

	}
}

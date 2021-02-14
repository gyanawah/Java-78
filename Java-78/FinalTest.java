final class A{
	final void display()
	{}
}
class B extends A{
	/*
	void display() // error: display() in B cannot override display() in A -  overridden method is final
	{}
	*/
}

class FinalTest 
{
	//final FinalTest() //error: modifier final not allowed here
	//{}

	final int n = 15; //instance variable
	public static void main(String[] args) 
	{
		final int n = 25; //local variable
		System.out.println(n);
		//n = 26; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 16; //error: cannot assign a value to final variable n
		System.out.println(obj.n);
	}
}

package co.edureka;

public class Student {
	private String name;

	public Student() {
		System.out.println("-- constructor with zero parameters");
	}

	public Student(String name) {
		this.name = name;
		System.out.println("-- constructor with one parameter");
	}

	public String getName() {
		System.out.println("-- inside getName() method");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("-- inside setName() method");
	}

	@Override
	public String toString() {
		return "Student [name = " + name + "]";
	}
	
	public void myInit1() {
		System.out.println("-- user-defined init method-1");
	}
	public void myInit2() {
		System.out.println("-- user-defined init method-2");
	}	
	public void myDestroy() {
		System.out.println("-- user-defined destroy method");
	}	
}

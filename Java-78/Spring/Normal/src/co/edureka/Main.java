package co.edureka;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("Sunil");
		System.out.println(st1);
		
		Student st2 = new Student("Joseph");
		System.out.println(st2);
	}
}

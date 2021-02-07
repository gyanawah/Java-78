class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Naveen";
		sal = 5000f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) 
	{
		//create an object for Employee
		Employee emp = new Employee();

		//access the state of object using reference
		System.out.println(emp.empno + " | "+emp.name+" | "+emp.sal);

		//access state of object using method
		emp.getDetails();

		//1)to change the state of object using reference
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500f;
		emp.getDetails();

		//2)to change the state of object using method
		emp.setDetails();
		emp.getDetails();
	}
}

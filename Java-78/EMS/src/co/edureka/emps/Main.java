package co.edureka.emps;

import java.util.List;

import co.edureka.emps.config.EmployeeDAOFactory;
import co.edureka.emps.dao.EmployeeDAO;
import co.edureka.emps.entity.Employee;

public class Main {

	public static void main(String[] args) throws Exception{		
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();
		//---- make it as a menu driven program----
		
		//to save an Employee
		Employee emp = new Employee(106,"Sanjay",1525.5f);
		dao.saveEmp(emp);
		System.out.println("-----------------------------");

		//to update an Employee
		emp = new Employee(101,"Sunil Joseph",5250f);
		dao.updateEmp(emp);
		System.out.println("-----------------------------");
		
		//to delete an Employee
		int empno = 105;
		dao.deleteEmp(empno);
		System.out.println("-----------------------------");
		
		//to search an employee
		emp = dao.searchEmp(101);
		if(emp != null)
			System.out.println(emp);
		else
			System.out.println("No matching employee found with empno=101");
		
		System.out.println("-----------------------------");
		List<Employee> emps = dao.getEmployees();
		for(Employee e : emps) {
			System.out.println(e);
			Thread.sleep(1000);
		}
	}
}

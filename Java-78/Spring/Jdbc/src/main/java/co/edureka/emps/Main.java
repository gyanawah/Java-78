package co.edureka.emps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.emps.dao.EmployeeDao;
import co.edureka.emps.dto.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		EmployeeDao dao = (EmployeeDao)context.getBean("empdao");
		
		Employee emp = new Employee(110,"Anirudh",25000f);
		dao.saveEmp(emp);
		
		System.out.println("------------------------------------------");
		emp = new Employee(110,"Anirudh Ghosh",25123f);
		dao.updateEmp(emp);
		
		System.out.println("------------------------------------------");
		dao.deleteEmp(102);
		
		System.out.println("------------------------------------------");
		List<Employee> emps = dao.getEmployees();
		for(Employee em : emps) {
			System.out.println(em);
			try {
				Thread.sleep(1300);
			} catch (InterruptedException e) {e.printStackTrace(); }
		}
	}
}

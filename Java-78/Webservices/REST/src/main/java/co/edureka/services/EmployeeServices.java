package co.edureka.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.bindings.Employee;

@Path("/employee")
public class EmployeeServices {
	@GET
	@Path("/all")
	@Produces("application/json")
	public List<Employee> getAllEmployees() {
		ArrayList<Employee> employeesList = new ArrayList<Employee>();

		employeesList.add(new Employee(101, "Sunil Joseph",2500f));
		employeesList.add(new Employee(201, "Anirudh", 3500f));
		employeesList.add(new Employee(301, "Jefferey", 4500f));

		return employeesList;
	}
	
	@POST
    @Consumes("application/json")
    @Produces("text/html")
    @Path("/posting")
    public String postMessage(Employee emp) throws Exception{        
        System.out.println("Emp ID = "+emp.getEmpno());
        System.out.println("Emp Name  = "+emp.getEname());
        System.out.println("Salary = "+ emp.getSal());
        
        return "received employee details";
    }	
}

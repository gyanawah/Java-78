package co.edureka.emps.dao;

import java.util.List;

import co.edureka.emps.entity.Employee;

public interface EmployeeDAO {
 void saveEmp(Employee emp) throws Exception;
 void updateEmp(Employee emp) throws Exception;
 void deleteEmp(int eno) throws Exception;
 Employee searchEmp(int eno) throws Exception;
 List<Employee> getEmployees() throws Exception;
}

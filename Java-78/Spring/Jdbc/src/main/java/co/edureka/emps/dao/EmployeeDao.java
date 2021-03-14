package co.edureka.emps.dao;

import java.util.List;

import co.edureka.emps.dto.Employee;

public interface EmployeeDao {
 void saveEmp(Employee emp);
 void updateEmp(Employee emp);
 void deleteEmp(int eno);
 public List<Employee> getEmployees();
}

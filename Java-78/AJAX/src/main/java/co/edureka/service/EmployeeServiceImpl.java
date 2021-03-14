package co.edureka.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.dao.EmployeeDao;
import co.edureka.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public Employee findEmployeeById(Integer eno) {
		Employee emp = dao.searchEmployee(eno);
		return emp;
	}

}

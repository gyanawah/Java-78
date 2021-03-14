package co.edureka.emps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import co.edureka.emps.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jt;
	
	public void saveEmp(Employee emp) {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		int n = jt.update(sql);
		System.out.println("Employee Saved!");
	}

	public void updateEmp(Employee emp) {
		String sql = "update emp set ename='"+emp.getEname()+"',sal="+emp.getSal()+" where empno="+emp.getEmpno();
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Employee Updated!");
	}

	public void deleteEmp(int eno) {
		String sql = "delete from emp where empno="+eno;
		int n = jt.update(sql);
		if(n>0)
			System.out.println("Employee Deleted!");		
		else
			System.out.println("No matching mployee to delete!");
	}

	public List<Employee> getEmployees() {
		String sql = "select * from emp";
		
		return jt.query(sql, new ResultSetExtractor<List<Employee>>() {
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> emps = new ArrayList<>();
				while(rs.next()) {
					int eno = rs.getInt(1);
					String name = rs.getString(2);
					float sal = rs.getFloat(3);
					Employee emp = new Employee(eno, name, sal);
					emps.add(emp);
				}
				return emps;
			}			
		});	
	}

}

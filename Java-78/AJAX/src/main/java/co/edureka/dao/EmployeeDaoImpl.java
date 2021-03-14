package co.edureka.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import co.edureka.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate template;
	
	public Employee searchEmployee(final Integer eno) {
		String sql = "select ename,sal from emp where empno="+eno;
		return template.query(sql, new ResultSetExtractor<Employee>() {			
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					return new Employee(eno,rs.getString(1),rs.getFloat(2));
				}
				return null;
			}			
		});	
	}

	public Employee searchEmployee(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

}

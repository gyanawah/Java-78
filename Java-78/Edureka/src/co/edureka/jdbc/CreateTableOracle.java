package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableOracle {

	public static void main(String[] args) throws Exception {
		//initialize Oracle JDBC Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//connect to oracle database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java78","password");
		System.out.println("<<< Connected to Oracle");
		
		//create a provision for passing SQL to DB
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno number(5), ename varchar(25), sal number(10,2), primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println("Database Table Created!");
		}catch(Exception ex) {
			System.out.println("Exception: "+ ex.toString());
		}
		
		//close the connection
		st.close();
		con.close();
	}
}

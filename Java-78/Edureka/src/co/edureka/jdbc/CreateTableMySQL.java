package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableMySQL {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		System.out.println("<<< Connected to edureka MySQL Database");
				
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno int(5), ename varchar(25), sal float(10,2), primary key(empno))";
		
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

package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();		
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101,'Sunil',2500)";
		String sql = "insert into emp(empno,ename,sal) values(102,'Anil',3500),(103,'Naveen',6500),(104,'Praveen',3500.5), (105,'Charles',2250.5)";
		
		try {
			int n = st.executeUpdate(sql);
			System.out.println("Employees Saved = " + n);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		st.close();
		con.close();
	}
}

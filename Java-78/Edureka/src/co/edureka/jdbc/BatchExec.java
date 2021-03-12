package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java78","password");		
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(101,'Ajith',2500)");
		st.addBatch("insert into emp values(102,'Arun',3500)");
		//st.addBatch("insert into emp values(101,'Aravind',4500)");
		st.addBatch("insert into emp values(103,'Aravind',4500)");
		st.addBatch("update emp set sal=5000");
		
		try {
			int[] n = st.executeBatch();
			for(int x : n) {
				System.out.println("Rows Affected = "+ x);
			}
			con.commit();
		}catch(Exception ex) {
			System.out.println(ex.toString());
			con.rollback();
		}
		
		st.close();
		con.close();
	}
}

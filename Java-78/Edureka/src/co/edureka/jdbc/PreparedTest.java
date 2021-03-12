package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection(); 
		
		Scanner sc = new Scanner(System.in);
		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
			System.out.print("enter empno: ");
			int eno = sc.nextInt();
			System.out.print("enter name: ");
			String name = sc.next();
			System.out.print("enter sal: ");
			float sal = sc.nextFloat();
			
			try {
				pst.setInt(1, eno);
				pst.setString(2, name);
				pst.setFloat(3, sal);
				
				int n = pst.executeUpdate();
				System.out.println("Employee Saved!");
				
				pst.clearParameters();
			}catch(Exception ex) {
				System.out.println(ex.toString());
			}
			
			System.out.print("Do you want to save more employees [Y/N]: ");
			req=sc.next();
		}
		
		sc.close();
		con.close();
	}
}

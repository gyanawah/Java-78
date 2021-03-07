package co.edureka.student;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.student.entity.Student;
import co.edureka.student.utils.HibernateUtils;

public class SaveStudents {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		String req = "Y";
		
		while(req.equalsIgnoreCase("Y")) {
			System.out.println("enter student name, email and mobile: ");
			String name = sc.next();
			String email = sc.next();
			String mobile = sc.next();
			
			Student st = new Student(name, email,mobile);
			
			session.save(st);
			System.out.print("do you want to add more students [Y/N]: ");
			req = sc.next();
		}
		System.out.println("-------------------------------------");
		sc.close();
		tx.commit();
		
		session.close();
		sf.close();
	}

}

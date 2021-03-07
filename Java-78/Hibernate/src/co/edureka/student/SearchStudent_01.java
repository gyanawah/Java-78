package co.edureka.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.student.entity.Student;
import co.edureka.student.utils.HibernateUtils;

public class SearchStudent_01 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();		

		Student st = new Student();		
		System.out.println(st);
		
		try {
			//session.load(st, Integer.valueOf(102));
			session.load(st, Integer.valueOf(1023));
		}catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println(st);
		
		session.close();
		sf.close();
	}

}

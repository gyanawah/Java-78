package co.edureka.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.student.entity.Student;
import co.edureka.student.utils.HibernateUtils;

public class SearchStudent_02 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();		

		//Student st = session.get(Student.class, Integer.valueOf(101));
		Student st = session.get(Student.class, Integer.valueOf(1024));
		if(st != null)
			System.out.println(st);
		else
			System.out.println("No matching student with ID: 1024");
		
		session.close();
		sf.close();

	}

}

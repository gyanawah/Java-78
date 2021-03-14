package co.edureka.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.student.entity.Student;
import co.edureka.student.utils.HibernateUtils;

public class FirstLevelCacheTest {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session1 = sf.openSession();

		Student st1 = session1.get(Student.class, Integer.valueOf(101));
		System.out.println(st1);
		System.out.println("---------------------------------------");
		
		Student st2 = session1.get(Student.class, Integer.valueOf(101));
		System.out.println(st2);
		
		session1.close();
		sf.close();
	}
}

package co.edureka.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.student.entity.Student;
import co.edureka.student.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		/*
		Student st = new Student(101,"Sunil Joseph","sunil@edureka.co","1234567890");
		session.delete(st);		
		*/
		
		
		Student st = session.get(Student.class, Integer.valueOf(109));		
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}
		else
			System.out.println("No matching student with ID: 109");
	
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();
	}
}

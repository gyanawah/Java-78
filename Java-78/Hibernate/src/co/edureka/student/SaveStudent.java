package co.edureka.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.student.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		Configuration config = new Configuration(); 
		config.configure("co/edureka/student/configs/hibernate.cfg.xml"); //XML Parsing
		
		SessionFactory sfactory = config.buildSessionFactory();
		
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st = new Student(101,"Sunil","sunil@hotmail.com","9848586878");
		
		//save student instance with hibernate
		session.save(st);
		System.out.println("------------------------------------");
		
		//commit the transaction
		tx.commit();
		
		session.close();
		sfactory.close();
	}
}

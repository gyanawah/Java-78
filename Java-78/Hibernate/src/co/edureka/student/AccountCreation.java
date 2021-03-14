package co.edureka.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.student.entity.Account;
import co.edureka.student.utils.HibernateUtils;

public class AccountCreation {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Account acc = new Account(10001233L, "Sunil Joseph", 25000.5f);
		session.save(acc);
		
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}

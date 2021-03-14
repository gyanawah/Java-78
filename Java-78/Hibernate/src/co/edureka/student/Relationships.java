package co.edureka.student;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.student.entity.Batch;
import co.edureka.student.entity.Faculty;
import co.edureka.student.utils.HibernateUtils;

public class Relationships {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Faculty faculty = new Faculty(101,"Sunil Joseph");
		
		Batch batch1 = new Batch(1, "Java 30th Jan", faculty);
		Batch batch2 = new Batch(2, "Java 28th Feb", faculty);
		Batch batch3 = new Batch(3, "Java 27th Mar", faculty);
		
		Set<Batch> batches = new HashSet<>();
		batches.add(batch1);
		batches.add(batch2);
		batches.add(batch3);
		
		faculty.setBatches(batches);
		
		session.save(faculty);
		
		tx.commit();
		session.close();
		sf.close();
	}

}

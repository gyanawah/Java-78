package co.edureka.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.student.entity.Student;
import co.edureka.student.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		/*
		//String hql = "from co.edureka.student.entity.Student";
		//String hql = "from co.edureka.student.entity.Student where sname like 'S%'";
		String hql = "from co.edureka.student.entity.Student where sname='Bharath'";		
		Query<Student> query = session.createQuery(hql);
		*/
		
		/*
		//----working with positional parameters
		String hql = "from co.edureka.student.entity.Student where studid between ?1 and ?2";
		Query<Student> query = session.createQuery(hql);
		query.setParameter(1, 101);
		query.setParameter(2, 105);
		*/
		
		
		//----working with named parameters
		String hql = "from co.edureka.student.entity.Student where studid between :minsid and :maxsid";
		Query<Student> query = session.createQuery(hql);
		query.setParameter("minsid", 105);
		query.setParameter("maxsid", 130);
		
		
		List<Student> students = query.getResultList();
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		
		System.out.println("---------------------------------------");
		
		session.beginTransaction();
		
		hql = "update co.edureka.student.entity.Student set sname='Bharath Kumar' where studid=108";
		Query<Student> updateQuery = session.createQuery(hql);
		int rowsAffected = updateQuery.executeUpdate();
		System.out.println("Students updated = "+ rowsAffected);
		session.getTransaction().commit();
		
		
		session.close();
		sf.close();
	}
}

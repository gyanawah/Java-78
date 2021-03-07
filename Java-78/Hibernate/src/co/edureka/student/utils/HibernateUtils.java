package co.edureka.student.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
 public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration(); 
		config.configure("co/edureka/student/configs/hibernate.cfg.xml"); //XML Parsing
		
		SessionFactory sfactory = config.buildSessionFactory();
		return sfactory;
 }
}

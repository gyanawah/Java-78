package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// initialize spring container (IoC)
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("----------------------------------");
		
		((ConfigurableApplicationContext)factory).close();
	}
}

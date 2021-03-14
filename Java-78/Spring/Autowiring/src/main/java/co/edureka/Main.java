package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.service.UserService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		UserService serviceObj = (UserService)context.getBean("userservice");
		serviceObj.saveUserDetails();
	}

}

package co.edureka.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.dao.UserDao;

public class UserService {
 //@Autowired	
 private UserDao dao;
 public UserService() {
	 System.out.println("**-- UserService :: constructor --**");
 }

public UserDao getDao() {
	System.out.println("-- inside getDao()");
	return dao;
}
@Autowired
public void setDao(UserDao dao) {
	this.dao = dao;
	System.out.println("-- inside setDao()");
}

 public void saveUserDetails() {
	 dao.saveUser();
 }
}

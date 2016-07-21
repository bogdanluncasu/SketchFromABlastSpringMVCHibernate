package service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import model.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void addUser(User user){
		userDao.saveUser(user);
	}
	
	public boolean isLogged(String username,String password){
		User u=userDao.getLoggedUser(username, password);
		return u!=null?true:false;
	}
	//autentificare



}

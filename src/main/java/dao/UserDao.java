package dao;

import org.springframework.stereotype.Repository;

import model.User;

@Repository
public class UserDao extends AbstractDao<Integer, User> {
	 
    public User findById(int id) {
        return getByKey(id);
    }
 
    public void saveEmployee(User employee) {
    	System.out.println("Most important place");
        persist(employee);
    }
 
  
}

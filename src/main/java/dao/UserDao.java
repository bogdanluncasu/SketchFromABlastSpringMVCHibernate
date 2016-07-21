package dao;


import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public class UserDao extends AbstractDao<Integer, User> {
	 

	public User findById(int id) {
        return getByKey(id);
    }
 
    public void saveUser(User user) {
        persist(user);       
    }
    
    public User getLoggedUser(String username,String password){
		Query query = getSession().createQuery("from User where nume like 'Leeroy'");
		User u=(User) (query.list().size()>0?query.list().get(0):null);
		return u;
    }
 
  
}

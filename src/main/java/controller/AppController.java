package controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.UserDao;
import model.User;

@Controller
@RequestMapping("/")
@Transactional
public class AppController {
	@Autowired
	private UserDao userDao;

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listEmployees(ModelMap model) {
    	User u=new User();
    	u.setSurName("Leeroy");
    	u.setLastName("Jenkins");
    	userDao.saveEmployee(u);
    	System.out.println("Not wow");
    	return "index";
    }
}

package controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.UserDao;
import model.User;
import service.UserService;

@Controller
@RequestMapping("/")
public class AppController {
	@Autowired
	private UserService userService;

    @RequestMapping(value = { "/"  }, method = RequestMethod.GET)
    public String index(ModelMap model) {
    	return "index";
    }
    
    @RequestMapping(value = { "/"  }, method = RequestMethod.POST)
    public Integer listEmployees(@RequestBody User u,ModelMap model) {
    	if(u.getSurName().trim().length()!=0)
    		return 1;
    	return 0;
    	//return "index";
    }
}

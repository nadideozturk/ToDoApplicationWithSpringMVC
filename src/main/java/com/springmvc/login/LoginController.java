package com.springmvc.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("userName")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String userName,@RequestParam String password, ModelMap model) {
		if(!service.userValidation(userName, password)) {
			return "login";
		}
		model.put("userName", userName);
		model.put("password", password);
		return "welcome";
	}
}

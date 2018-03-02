package com.springmvc.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.springmvc.security.UserService;

@Controller
public class WelcomeController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.put("userName",userService.getLoggedInUserName());
		return "welcome";
	}
}

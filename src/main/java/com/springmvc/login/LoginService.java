package com.springmvc.login;

import org.springframework.stereotype.Service;


@Service
public class LoginService {
	
	
	public boolean userValidation(String userName, String password) {
		if((userName.equals("nadide") && password.equals("somepassword"))) {
			return true;
		}else {
			return false;
		}		
	}

}

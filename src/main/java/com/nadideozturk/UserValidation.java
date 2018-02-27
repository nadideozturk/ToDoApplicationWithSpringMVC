package com.nadideozturk;

public class UserValidation {
	public boolean userValidation(String userName, String password) {
		if((userName.equals("Nadide") && password.equals("somepassword"))) {
			return true;
		}else {
			return false;
		}		
	}
}

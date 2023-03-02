package com.serviceIMPL;

import com.pojo.student;
import com.serivce.LogIn;

public class LogInserviceIMPL implements LogIn {

	@Override
	public boolean LoginUser() {

		boolean status = false;
		student s = new student();
		s.setSname("zaid");
		s.setSpassword(12345l);

		if (s != null && s.getSname().equals(s)) {
			status = true;
			System.out.println("Login Successfull!!");
		} else {
			System.out.println("Wrong Creadentials");
			return LoginUser();
		}

		return status;
	}

}

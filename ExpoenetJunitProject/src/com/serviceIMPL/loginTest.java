package com.serviceIMPL;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pojo.student;

class loginTest {

	@Test
	void UserNametest() {
		
		student s = new student();
		s.setSname("zaid");
		s.setSpassword(12345l);
		
	}

}

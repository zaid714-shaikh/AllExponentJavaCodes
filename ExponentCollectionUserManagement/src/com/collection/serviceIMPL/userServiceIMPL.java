package com.collection.serviceIMPL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.collection.Service.userService;
import com.collection.model.User;

public class userServiceIMPL implements userService {
	Scanner sc = new Scanner(System.in);
	List<User> l = new ArrayList();

	@Override
	public void addUser() {
		System.out.println("how many Students you want:-");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			User u = new User();
			System.out.println("Enter the ID: - ");
			int id = sc.nextInt();
			u.setUid(id);
		

			System.out.println("Enter user name:- ");
			String name = sc.next();
			u.setUname(name);

			System.out.println("Enter the Address:- ");
			String address  =sc.next();
			u.setUaddress(address);
			
			
			System.out.println("Enter the Phone number:- ");
			long phonum = sc.nextLong();
			u.setUphonumber(phonum);
			
			System.out.println("Enter the Pancard Number :- ");
			String pannum = sc.next();
			u.setPancardno(pannum);
			
			l.add(u);

		}
	}

	@Override
	public void showUser() {
		for(User u:l)
		{
			System.out.println(u);
		}
	}

	@Override
	public void updateuser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub

	}

}

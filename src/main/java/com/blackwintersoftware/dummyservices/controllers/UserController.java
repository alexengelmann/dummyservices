package com.blackwintersoftware.dummyservices.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blackwintersoftware.dummyservices.models.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/string", method = RequestMethod.GET)
	String getUserString(){
		return "Mr Users";
	}
	
	@RequestMapping(value="/single", method = RequestMethod.GET)
	User getSingleUser(){
		User user = new User("Professor Doctor Jones", "123 Fake Street");
		return user;
	}
	
	@RequestMapping(value="/multi", method = RequestMethod.GET)
	List<User> getMultiUser(){
		User user = new User("Professor Doctor Jones", "123 Fake Street");
		User user2 = new User("Mr Krieger", "321 Fun Lane");
		User user3 = new User("Alex", "Best Street");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		userList.add(user2);
		userList.add(user3);
		
		return userList;
	}
	
}

package com.springBootJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {

	@Autowired
	UserService UserService;
	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)  
    public void addUser(@RequestBody UserData userData){  
       UserService.addUser(userData);
    }  
}

package com.springBootJpa.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	private CustomResponse customResponse = new CustomResponse();
	
	@RequestMapping("/")
	public List<UserData> getAllUser(){
		return userService.getAllUser();
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public ResponseEntity<CustomResponse> addUser(@RequestBody UserData userData) {
		userService.addUser(userData);
		customResponse.setMessage("Saved successfully..");
		customResponse.setStatusCode(100);
		return new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
	}

	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public Optional<UserData> getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}

}

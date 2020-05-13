package com.example.swagger_example.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {
	
	private List<User> users = new ArrayList();
	
	@ApiOperation(value="Metod will be used to list of users")
	@RequestMapping("/getUsers")
	List<User> getUsers() {
		return users;
	}
	
	@RequestMapping(path="/addUser", method= RequestMethod.POST)
	void addUser(@RequestBody User user){
		users.add(user);
	}

}

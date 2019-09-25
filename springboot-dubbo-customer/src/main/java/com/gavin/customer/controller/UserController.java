package com.gavin.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gavin.customer.service.UserService;
import com.gavin.dubbo.pojo.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("user/add")
	public int addUser(User user) {
		try {
			return this.userService.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	@GetMapping("user/list")
	public List<User> listUser(User user){
		try {
			return this.userService.select(user);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

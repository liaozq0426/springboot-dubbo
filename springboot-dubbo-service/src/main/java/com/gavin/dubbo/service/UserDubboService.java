package com.gavin.dubbo.service;

import java.util.List;

import com.gavin.dubbo.pojo.User;

public interface UserDubboService {
	
	public int insertUser(User user);
	
	public List<User> selectUsers(User user);
	
}

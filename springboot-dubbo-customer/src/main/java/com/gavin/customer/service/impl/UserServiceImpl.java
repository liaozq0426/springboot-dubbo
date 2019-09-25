package com.gavin.customer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gavin.customer.service.UserService;
import com.gavin.dubbo.pojo.User;
import com.gavin.dubbo.service.UserDubboService;

@Service
public class UserServiceImpl implements UserService{
	
	@Reference
	private UserDubboService userDubboService;
	
	@Override
	public int insert(User user) throws Exception {
		return userDubboService.insertUser(user);
	}

	@Override
	public List<User> select(User user) throws Exception {
		return userDubboService.selectUsers(user);
	}

}

package com.gavin.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.gavin.dubbo.mapper.UserMapper;
import com.gavin.dubbo.pojo.User;
import com.gavin.dubbo.service.UserDubboService;

@Component
@Service
public class UserDubboServiceImpl implements UserDubboService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int insertUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public List<User> selectUsers(User user) {
		return userMapper.select(user);
	}
	
}

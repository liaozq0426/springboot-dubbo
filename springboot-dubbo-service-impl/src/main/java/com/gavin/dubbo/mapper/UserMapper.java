package com.gavin.dubbo.mapper;

import java.util.List;

import com.gavin.dubbo.pojo.User;

public interface UserMapper {
	
	public int insert(User user);
	
	public List<User> select(User user);
}

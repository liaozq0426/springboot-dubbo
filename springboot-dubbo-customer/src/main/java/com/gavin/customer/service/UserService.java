package com.gavin.customer.service;

import java.util.List;

import com.gavin.dubbo.pojo.User;

public interface UserService {

	int insert(User user) throws Exception;

	List<User> select(User user) throws Exception;

}

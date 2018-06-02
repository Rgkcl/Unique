package com.unique.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unique.mapper.UserMapper;
import com.unique.pojo.UserExample;
import com.unique.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	public String selectAll() {
		
		UserExample example = new UserExample() ;
		return userMapper.selectByExample(example ).toString();
	}

}

package com.wj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wj.dao.UserDao;
import com.wj.entity.User;
import com.wj.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public int save(List<User> users) {
		for(User user:users) {
			userDao.save(user);
		}
//		userDao.save(users.get(0));
//		save(users.get(1));
		return 1;
	}
	
	private int save(User user) {
		userDao.save(user);
		return 1;
	}
	
	public User get(int i) {
		return userDao.get(i);
	}
}

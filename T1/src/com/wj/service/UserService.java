package com.wj.service;

import java.util.List;

import com.wj.entity.User;

public interface UserService {
	public User get(int i);
	public int save(List<User> users);
}

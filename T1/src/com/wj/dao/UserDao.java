package com.wj.dao;

import com.wj.entity.User;
import com.wj.repository.MyBatisRepository;

/**
 * @author 
 */
@MyBatisRepository
public interface UserDao {
    public User get(Integer id);
    public int save(User user);
}
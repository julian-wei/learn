package com.wj.dao;

import com.wj.entity.Item;
import com.wj.repository.MyBatisRepository;

/**
 * @author 
 */
@MyBatisRepository
public interface ItemDao {
    public Item get(Integer id);
    public int save(Item item);
}
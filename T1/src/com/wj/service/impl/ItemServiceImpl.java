package com.wj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wj.dao.ItemDao;
import com.wj.entity.Item;
import com.wj.service.ItemService;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;
	
	public int save(List<Item> items) {
		for(Item item:items) {
			itemDao.save(item);
		}
		return 1;
	}
	
	public Item get(int i) {
		return itemDao.get(i);
	}
}

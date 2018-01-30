package com.wj.service;

import java.util.List;

import com.wj.entity.Item;

public interface ItemService {
	public Item get(int i);
	public int save(List<Item> items);
}

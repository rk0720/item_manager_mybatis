package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Item;
import com.example.mapper.ItemMapper;

@Service
public class ItemService {
	
	private final ItemMapper itemMapper;
	
	@Autowired
	public ItemService(ItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}
	
	public List<Item> findAll() {
		return this.itemMapper.findAll();
	}

}

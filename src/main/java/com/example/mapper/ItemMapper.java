package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Item;

@Mapper
public interface ItemMapper {
	public List<Item> findAll();
	
	public void insert(Item item);
	
	public void update(Item item);
	
	public Item findById(Integer id);
	
	public void delete(Integer id);
}

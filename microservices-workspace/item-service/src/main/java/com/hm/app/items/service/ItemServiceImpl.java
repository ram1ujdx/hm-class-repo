package com.hm.app.items.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.app.items.model.Item;
import com.hm.app.items.repository.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepo repo;

	@Override
	public List<Item> getItems(List<Long> itemIds) {
		return repo.findAllById(itemIds);
	}

	@Override
	public Item addItem(Item item) {
		return repo.save(item);
	}

	@Override
	public Item getItemById(long id) {
		return repo.findById(id).get();
	}

	
	
}

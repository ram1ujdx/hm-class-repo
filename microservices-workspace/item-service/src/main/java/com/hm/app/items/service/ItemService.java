package com.hm.app.items.service;

import java.util.List;

import com.hm.app.items.model.Item;

public interface ItemService {

	public List<Item> getItems(List<Long> itemIds);
	
	public 	Item addItem(Item item);
	
	public Item getItemById(long id);
	
}

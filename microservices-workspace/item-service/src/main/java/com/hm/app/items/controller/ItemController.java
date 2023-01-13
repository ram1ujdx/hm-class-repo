package com.hm.app.items.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.app.items.dto.ItemList;
import com.hm.app.items.model.Item;
import com.hm.app.items.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	private ItemService service;

	@PostMapping
	public Item addItem(@RequestBody Item item) {
		return service.addItem(item);
	}
	
	@PostMapping("/search")
	public List<Item> getAllItemsByIds(@RequestBody ItemList itemList){
		
		return service.getItems(itemList.getItems());
	}
	
}

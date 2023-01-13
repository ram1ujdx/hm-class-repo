package com.hm.app.items.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.app.items.model.Item;

public interface ItemRepo extends JpaRepository<Item, Long> {

}

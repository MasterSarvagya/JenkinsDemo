package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.InventoryItem;
import com.example.bean.InventoryItemList;
import com.example.persistence.InventoryDao;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryDao inventoryDao;

	@Override
	public InventoryItem getInventoryItem(String code) {
		return inventoryDao.getInventoryItem(code);
	}

	@Override
	public InventoryItemList getInventoryItemList() {
		return inventoryDao.getInventoryItemList();
	}

	@Override
	public InventoryItem updateInventoryItemQuantity(String code, int quantity) {
		return inventoryDao.updateInventoryItemQuantity(code, quantity);
	}

}

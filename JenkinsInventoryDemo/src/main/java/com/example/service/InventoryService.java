package com.example.service;

import com.example.bean.InventoryItem;
import com.example.bean.InventoryItemList;

public interface InventoryService {

	public InventoryItem getInventoryItem(String code);

	public InventoryItemList getInventoryItemList();

	public InventoryItem updateInventoryItemQuantity(String code, int quantity);

}

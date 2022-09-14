package com.example.persistence;

import com.example.bean.InventoryItem;
import com.example.bean.InventoryItemList;

public interface InventoryDao {

	public InventoryItem getInventoryItem(String code);

	public InventoryItemList getInventoryItemList();

	public InventoryItem updateInventoryItemQuantity(String code, int quantity);

}

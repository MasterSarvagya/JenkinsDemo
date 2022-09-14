package com.example.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bean.InventoryItem;
import com.example.bean.InventoryItemList;
import com.example.database.InventoryDataSource;

@Repository
public class InventoryDaoImpl implements InventoryDao {

	@Override
	public InventoryItemList getInventoryItemList() {

		InventoryItemList inventoryItemList = new InventoryItemList(InventoryDataSource.inventoryItems);

		return inventoryItemList;
	}

	@Override
	public InventoryItem getInventoryItem(String code) {
		List<InventoryItem> inventoryItems = InventoryDataSource.inventoryItems;
		for (InventoryItem inventoryItem : inventoryItems) {
			if (inventoryItem.getProductCode().equals(code))
				return inventoryItem;
		}

		return null;
	}

	@Override
	public InventoryItem updateInventoryItemQuantity(String code, int quantity) {

		List<InventoryItem> inventoryItems = InventoryDataSource.inventoryItems;
		for (InventoryItem inventoryItem : inventoryItems) {
			if (inventoryItem.getProductCode().equals(code)) {
				inventoryItem.setAvailableQuantity(quantity);
				InventoryDataSource.setInventoryItems(inventoryItems);
				return inventoryItem;
			}
		}

		return null;

	}

}

package com.example.test;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.bean.InventoryItem;

class JenkinsTestFile {

	private static List<InventoryItem> inventoryItems;

	@Autowired
	private RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		inventoryItems.add(new InventoryItem(1, "ABC111", 1001));
		inventoryItems.add(new InventoryItem(2, "ABC222", 1002));
		inventoryItems.add(new InventoryItem(3, "ABC333", 1003));
		inventoryItems.add(new InventoryItem(4, "ABC444", 1004));
		inventoryItems.add(new InventoryItem(5, "ABC555", 1005));
		inventoryItems.add(new InventoryItem(6, "ABC666", 1006));
		inventoryItems.add(new InventoryItem(7, "ABC777", 1007));
		inventoryItems.add(new InventoryItem(8, "ABC888", 1008));
		inventoryItems.add(new InventoryItem(9, "ABC999", 1009));
	}

	@Test
	void TestAllInventroy() {

	}

}

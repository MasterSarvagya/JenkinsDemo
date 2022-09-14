package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.bean.InventoryItem;
import com.example.bean.InventoryItemList;
import com.example.service.InventoryService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private InventoryService inventoryService;

	@GetMapping(path = "/code", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<InventoryItemList> listAllProducts() {

		InventoryItemList inventoryItemList = inventoryService.getInventoryItemList();
		HttpStatus httpStatus;
		if (inventoryItemList.getInventoryItems().isEmpty())
			httpStatus = HttpStatus.NOT_FOUND;
		else
			httpStatus = HttpStatus.OK;
		return new ResponseEntity<InventoryItemList>(inventoryItemList, httpStatus);
	}

	@GetMapping(path = "/code/{productCode}")
	public ResponseEntity<InventoryItem> searchProductByCode(@PathVariable("productCode") String code) {

		InventoryItem inventoryItem = inventoryService.getInventoryItem(code);
		if (inventoryItem != null)
			return new ResponseEntity<InventoryItem>(inventoryItem, HttpStatus.OK);
		return new ResponseEntity<InventoryItem>(new InventoryItem(), HttpStatus.NOT_FOUND);
	}

	@PutMapping(path = "/code/{productCode}/{availableQuantity}")
	public ResponseEntity<InventoryItem> updateInventoryItemQuantityByProductCode(
			@PathVariable("productCode") String code, @PathVariable("availableQuantity") int qty) {

		InventoryItem inventoryItem = inventoryService.updateInventoryItemQuantity(code, qty);
		if (inventoryItem != null)
			return new ResponseEntity<InventoryItem>(inventoryItem, HttpStatus.OK);
		return new ResponseEntity<InventoryItem>(new InventoryItem(), HttpStatus.NOT_FOUND);
	}

}

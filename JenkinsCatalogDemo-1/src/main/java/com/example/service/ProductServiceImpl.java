package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Product;
import com.example.bean.ProductList;
import com.example.persistence.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public Product getProduct(String code) {
		return productDao.getProduct(code);
	}

	@Override
	public ProductList getProductList() {
		return productDao.getProductList();
	}

}

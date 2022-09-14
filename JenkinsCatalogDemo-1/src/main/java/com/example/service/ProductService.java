package com.example.service;

import com.example.bean.Product;
import com.example.bean.ProductList;

public interface ProductService {

	public Product getProduct(String code);

	public ProductList getProductList();

}

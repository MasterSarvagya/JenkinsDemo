package com.example.persistence;

import com.example.bean.Product;
import com.example.bean.ProductList;

public interface ProductDao {

	public Product getProduct(String code);

	public ProductList getProductList();

}

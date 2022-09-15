package com.example.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bean.Product;
import com.example.bean.ProductList;
import com.example.database.ProductDataSource;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Override
	public Product getProduct(String code) {

		List<Product> products = ProductDataSource.products;

		for (Product product : products) {
			if (product.getCode().equals(code))
				return product;
		}

		return null;
	}

	@Override
	public ProductList getProductList() {

		ProductList productList = new ProductList(ProductDataSource.products);

		return productList;
	}

}

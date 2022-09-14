package com.example.database;

import java.util.ArrayList;
import java.util.List;

import com.example.bean.Product;

public class ProductDataSource {

	public static List<Product> products = new ArrayList<>();
	static {
		products.add(new Product(1, "ABC111", "PRODUCT 1", "AAAA", 1000));
		products.add(new Product(2, "ABC222", "PRODUCT 2", "BBBB", 1000));
		products.add(new Product(3, "ABC333", "PRODUCT 3", "CCCC", 1000));
		products.add(new Product(4, "ABC444", "PRODUCT 4", "DDDD", 1000));
		products.add(new Product(5, "ABC555", "PRODUCT 5", "EEEE", 1000));
		products.add(new Product(6, "ABC666", "PRODUCT 6", "FFFF", 1000));
		products.add(new Product(7, "ABC777", "PRODUCT 7", "GGGG", 1000));
		products.add(new Product(8, "ABC888", "PRODUCT 8", "HHHH", 1000));
		products.add(new Product(9, "ABC999", "PRODUCT 9", "IIII", 1000));
	}

}

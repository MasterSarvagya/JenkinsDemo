package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.bean.Product;
import com.example.bean.ProductList;
import com.example.service.ProductService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private ProductService productService;

	@GetMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductList> listAllProducts() {

		ProductList productList = productService.getProductList();
		HttpStatus httpStatus;
		if (productList.getProductlList().isEmpty())
			httpStatus = HttpStatus.NOT_FOUND;
		else
			httpStatus = HttpStatus.OK;
		return new ResponseEntity<ProductList>(productList, httpStatus);
	}

	@GetMapping(path = "/products/code/{productCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> searchProductByCode(@PathVariable("productCode") String code) {

		Product product = productService.getProduct(code);
		if (product == null)
			return new ResponseEntity<Product>(new Product(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

}

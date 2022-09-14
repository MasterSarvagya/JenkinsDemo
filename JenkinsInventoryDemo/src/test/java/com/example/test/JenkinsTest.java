package com.example.test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTest {

	private static List<Invent> products;

	@Autowired
	private RestTemplate restTemplate;

	@BeforeAll
	static void setupBeforeAll() {

		products = new ArrayList<>();
		products.add(new Product(1, "ABC111", "PRODUCT 1", "AAAA", 1));
		products.add(new Product(2, "ABC222", "PRODUCT 2", "BBBB", 2));
		products.add(new Product(3, "ABC333", "PRODUCT 3", "CCCC", 3));
		products.add(new Product(4, "ABC444", "PRODUCT 4", "DDDD", 4));
		products.add(new Product(5, "ABC555", "PRODUCT 5", "EEEE", 5));
		products.add(new Product(6, "ABC666", "PRODUCT 6", "FFFF", 6));
		products.add(new Product(7, "ABC777", "PRODUCT 7", "GGGG", 7));
		products.add(new Product(8, "ABC888", "PRODUCT 8", "HHHH", 8));
		products.add(new Product(9, "ABC999", "PRODUCT 9", "IIII", 9));

	}

	@Test
	void TestAllProducts() {

		ResponseEntity<ProductList> productResponseEntity = restTemplate.getForEntity("http://localhost:8080/products",
				ProductList.class);
		ProductList productList = productResponseEntity.getBody();

		assertEquals(new ProductList(products), productList);
	}

	@Test
	void TestProductsByCode1() {

		ResponseEntity<Product> productResponseEntity = restTemplate
				.getForEntity("http://localhost:8080/products/code/ABC111", Product.class);
		Product product = productResponseEntity.getBody();

		assertEquals(products.get(0), product);
	}

	@Test
	void TestProductsByCode2() {

		assertThrows(HttpClientErrorException.class,
				() -> restTemplate.getForEntity("http://localhost:8080/products/code/AAAA", Product.class));
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.database.ProductDataSource;

@SpringBootApplication(scanBasePackages = "com.example")
public class JenkinsCatalogDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsCatalogDemo1Application.class, args);

		System.out.println(ProductDataSource.products);
	}

	@Bean
	public RestTemplate getRestTemplate() {

		return new RestTemplate();

	}

}

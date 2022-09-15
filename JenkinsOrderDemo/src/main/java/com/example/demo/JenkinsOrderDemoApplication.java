package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.bean.Order;
import com.example.bean.OrderItem;
import com.example.persistence.OrderDao;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableEurekaClient
public class JenkinsOrderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsOrderDemoApplication.class, args);

		List<OrderItem> orderItems = new ArrayList<>();

		orderItems.add(new OrderItem(901, 101, 10, 50));
		orderItems.add(new OrderItem(902, 102, 11, 60));
		orderItems.add(new OrderItem(903, 103, 12, 70));

		OrderDao orderDao = Mockito.mock(OrderDao.class);
		Mockito.when(orderDao.findOrderById(901)).thenReturn(new Order(1L, "AAAA@GMAIL.COM", "ADDRESS A", orderItems));
		Mockito.when(orderDao.findOrderById(999)).thenReturn(null);

	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

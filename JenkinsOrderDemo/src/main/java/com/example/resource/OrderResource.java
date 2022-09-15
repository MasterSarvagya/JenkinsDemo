package com.example.resource;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Order;
import com.example.service.OrderService;

@RestController
public class OrderResource {

	@Autowired
	private OrderService orderService;

	@PostMapping(path = "/orders")
	public URL saveOder(Order order) {
		return null;
	}

	@GetMapping(path = "/orders/{id}")
	public Order findOrderById(Long id) {
		return null;
	}

}

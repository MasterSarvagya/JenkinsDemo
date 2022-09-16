package com.example.database;

import java.util.ArrayList;
import java.util.List;

import com.example.bean.Order;
import com.example.bean.OrderItem;

import lombok.Setter;

public class OrderDataSource {

	public static List<OrderItem> orderItems = new ArrayList<>();
	@Setter
	public static List<Order> orders = new ArrayList<>();

	static {

		orderItems.add(new OrderItem(901, 101, 10, 50));
		orderItems.add(new OrderItem(902, 102, 11, 60));
		orderItems.add(new OrderItem(903, 103, 12, 70));

		orders.add(new Order(1L, "AAAA@GMAIL.COM", "ADDRESS A", orderItems));
	}

}

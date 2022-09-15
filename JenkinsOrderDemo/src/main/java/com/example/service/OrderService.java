package com.example.service;

import com.example.bean.Order;

public interface OrderService {

	public boolean saveOrder(Order order);

	public Order findOrderById(long id);

}

package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Order;
import com.example.persistence.OrderDao;

import lombok.Setter;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	@Setter
	private OrderDao orderDao;

	@Override
	public boolean saveOrder(Order order) {
		return orderDao.saveOrder(order);
	}

	@Override
	public Order findOrderById(long id) {
		return orderDao.findOrderById(id);
	}

}

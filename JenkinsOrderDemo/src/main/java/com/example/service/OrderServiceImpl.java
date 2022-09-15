package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Order;
import com.example.persistence.OrderDao;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	@Override
	public boolean saveOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order findOrderById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

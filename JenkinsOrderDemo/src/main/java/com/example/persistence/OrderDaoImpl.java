package com.example.persistence;

import org.springframework.stereotype.Repository;

import com.example.bean.Order;

@Repository
public class OrderDaoImpl implements OrderDao {

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

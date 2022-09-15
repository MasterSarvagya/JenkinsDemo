package com.example.persistence;

import com.example.bean.Order;

public interface OrderDao {

	public boolean saveOrder(Order order);

	public Order findOrderById(long id);

}

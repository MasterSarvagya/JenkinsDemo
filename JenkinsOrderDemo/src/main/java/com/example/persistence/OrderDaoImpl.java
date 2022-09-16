package com.example.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bean.Order;
import com.example.database.OrderDataSource;

@Repository
public class OrderDaoImpl implements OrderDao {

	@Override
	public boolean saveOrder(Order order) {

		if (order == null)
			return false;

		List<Order> orders = OrderDataSource.orders;
		orders.add(order);
		OrderDataSource.setOrders(orders);

		return true;
	}

	@Override
	public Order findOrderById(long id) {

		List<Order> orders = OrderDataSource.orders;
		for (Order order : orders) {
			if (order.getId().equals(id))
				return order;
		}
		return null;
	}

}

package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.bean.Order;
import com.example.bean.OrderItem;
import com.example.persistence.OrderDaoImpl;

@SpringBootTest
class PersistenceTest {

	private static OrderDaoImpl orderDao;

	private static List<OrderItem> orderItems;
	private static Order order;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		orderItems = new ArrayList<>();

		orderItems.add(new OrderItem(901, 101, 10, 50));
		orderItems.add(new OrderItem(902, 102, 11, 60));
		orderItems.add(new OrderItem(903, 103, 12, 70));
		order = new Order(1L, "AAAA@GMAIL.COM", "ADDRESS A", orderItems);

	}

	@Test
	void saveOrder_Test1() {
		assertTrue(orderDao.saveOrder(order));
	}

	@Test
	void saveOrder_Test2() {
		assertFalse(orderDao.saveOrder(null));
	}

	@Test
	void findOrderById_Test1() {
		assertEquals(order, orderDao.findOrderById(1L));
	}

	@Test
	void findOrderById_Test2() {
		assertEquals(null, orderDao.findOrderById(100L));
	}

}

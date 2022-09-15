package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.bean.Order;
import com.example.bean.OrderItem;
import com.example.persistence.OrderDao;
import com.example.service.OrderServiceImpl;

@SpringBootTest
class ServiceTest {

	private static OrderDao orderDao;

	@Autowired
	private static OrderServiceImpl orderService;

	private static List<OrderItem> orderItems;
	private static Order order;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		orderDao = Mockito.mock(OrderDao.class);
		orderItems = new ArrayList<>();

		orderItems.add(new OrderItem(901, 101, 10, 50));
		orderItems.add(new OrderItem(902, 102, 11, 60));
		orderItems.add(new OrderItem(903, 103, 12, 70));
		order = new Order(1L, "AAAA@GMAIL.COM", "ADDRESS A", orderItems);

		when(orderDao.findOrderById(1L)).thenReturn(order);
		when(orderDao.findOrderById(100L)).thenReturn(null);

		orderService.setOrderDao(orderDao);
	}

	@Test
	void saveOrder_Test1() {
		assertTrue(orderService.saveOrder(order));
	}

	@Test
	void saveOrder_Test2() {
		assertFalse(orderService.saveOrder(null));
	}

	@Test
	void findOrderById_Test1() {
		assertEquals(order, orderService.findOrderById(1L));
	}

	@Test
	void findOrderById_Test2() {
		assertEquals(null, orderService.findOrderById(100L));
	}

}

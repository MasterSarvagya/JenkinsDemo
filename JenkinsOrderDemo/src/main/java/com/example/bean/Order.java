package com.example.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	private Long id;
	private String customerEmail;
	private String customerAddress;
	private List<OrderItem> items;

}

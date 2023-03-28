package com.examples.S04InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaomysql")
public class OrderDaoMYSQLImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Open connection to MYSQL DB");
		System.out.println("Run insert statement to create  MYSQL order");
		System.out.println("Order created in DB ");
		
	}

}

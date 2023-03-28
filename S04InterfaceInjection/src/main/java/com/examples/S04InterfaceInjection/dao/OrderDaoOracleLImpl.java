package com.examples.S04InterfaceInjection.dao;

	import org.springframework.stereotype.Component;

	@Component("orderdaooracle")
	public class OrderDaoOracleLImpl implements OrderDAO {

		@Override
		public void createOrder() {
			System.out.println("Open connection to Oracle DB");
			System.out.println("Run insert statement to create  Orcale order");
			System.out.println("Order created in DB ");
			
		}

	}



package com.neusoft.controller.cust.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.entity.Orders;
import com.neusoft.service.cust.crm.OrdersService;

@Controller
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping("selectNewsTypeAll")
	public List<Orders> selectNewsTypeAll()throws Exception{
		return ordersService.selectNewsTypeAll();
		}
}

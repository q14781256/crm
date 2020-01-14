package com.neusoft.service.cust.crm;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neusoft.entity.Orders;



public interface OrdersService {
	
	public List<Orders> selectNewsTypeAll();

	
}

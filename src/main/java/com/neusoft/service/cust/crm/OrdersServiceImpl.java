package com.neusoft.service.cust.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.Orders;
import com.neusoft.mapper.cust.crm.OrdersMapper;
@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersMapper ordersMapper;
	
	@Override
	public List<Orders> selectNewsTypeAll() {
		// TODO Auto-generated method stub
		return ordersMapper.selectNewsTypeAll();
	}
	
}

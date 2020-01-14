package com.neusoft.mapper.cust.crm;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.entity.Orders;


@Mapper
public interface OrdersMapper {
	
	@Select("select * from  order by ordersId")
	public List<Orders> selectNewsTypeAll();

	
}

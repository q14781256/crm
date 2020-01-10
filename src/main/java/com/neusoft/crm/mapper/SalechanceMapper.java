package com.neusoft.crm.mapper;

import java.util.List;

import com.neusoft.crm.entity.SaleChance;

public interface SalechanceMapper {
	//页面加载时全查询与模糊查询(1,3)
	List<SaleChance> selectAll(String queryCriteria);
	//分页暂留位置(2)
	
	//查询最大数据库编号+1
	
	//增加销售机会(9)
	int add(SaleChance saleChance);
	
	

}

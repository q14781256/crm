package com.neusoft.mapper.sale.crm;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.entity.SaleChance;

@Mapper
public interface SalePlanMapper {

	
	//在SalePlan页面显示所有未开发状态的SaleChance
	//@Select("select * from SaleChance where chanceStatus = #{chanceStatus} order by chanceId")
	public List<SaleChance> selectSaleInfoAll(SaleChance saleChance);

	//查总数
	//@Select("select count(*) from SaleChance where chanceStatus = #{chanceStatus}")
	public int selectSaleInfoAllcount(SaleChance saleChance);
}

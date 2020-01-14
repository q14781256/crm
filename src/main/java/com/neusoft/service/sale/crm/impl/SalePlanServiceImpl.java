package com.neusoft.service.sale.crm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.SaleChance;
import com.neusoft.mapper.sale.crm.SalePlanMapper;
import com.neusoft.service.sale.crm.SalePlanService;

@Service
public class SalePlanServiceImpl implements SalePlanService{
	@Autowired
	private SalePlanMapper salePlanMapper;

	@Override
	public List<SaleChance> selectSaleInfoAll(SaleChance saleChance) {
		return salePlanMapper.selectSaleInfoAll(saleChance);
	}

	@Override
	public int selectSaleInfoAllcount(SaleChance saleChance) {
		
		return salePlanMapper.selectSaleInfoAllcount(saleChance);
	}

	

	

	
	

}

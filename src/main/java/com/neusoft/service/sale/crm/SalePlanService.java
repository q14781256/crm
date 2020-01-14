package com.neusoft.service.sale.crm;

import java.util.List;

import com.neusoft.entity.SaleChance;

public interface SalePlanService {
	public List<SaleChance> selectSaleInfoAll(SaleChance saleChance);

	public int selectSaleInfoAllcount(SaleChance saleChance);


}

package com.neusoft.controller.sale.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.SaleChance;
import com.neusoft.service.sale.crm.SalePlanService;

@RestController
public class SalePlanController {
	@Autowired
	private SalePlanService salePlanService;
	
	@RequestMapping("/selectSaleInfoAll")
	public List<SaleChance> selectSalePlanAll(@RequestBody SaleChance saleChance) {
		return salePlanService.selectSaleInfoAll(saleChance);
	}
	@RequestMapping("/selectSaleInfoAllcount")
	public int selectSaleChanceCount(@RequestBody SaleChance saleChance) {
		return salePlanService.selectSaleInfoAllcount(saleChance);
	}
}

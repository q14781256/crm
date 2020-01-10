package com.neusoft.crm.entity;

public class LastClientOrders {
    private String clientCode;

    private Integer ordersId;

    private String ordersDate;

    private Integer ordersState;

    private Integer ordersTotal;

    private String remark;

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public Integer getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}

	public String getOrdersDate() {
		return ordersDate;
	}

	public void setOrdersDate(String ordersDate) {
		this.ordersDate = ordersDate;
	}

	public Integer getOrdersState() {
		return ordersState;
	}

	public void setOrdersState(Integer ordersState) {
		this.ordersState = ordersState;
	}

	public Integer getOrdersTotal() {
		return ordersTotal;
	}

	public void setOrdersTotal(Integer ordersTotal) {
		this.ordersTotal = ordersTotal;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

    
}
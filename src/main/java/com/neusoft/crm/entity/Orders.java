package com.neusoft.crm.entity;

public class Orders {
    private Integer ordersId;

    private String ordersDate;

    private String address;

    private Integer ordersState;

    private String clientCode;

    private Integer ordersTotal;

    private String remark;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getOrdersState() {
		return ordersState;
	}

	public void setOrdersState(Integer ordersState) {
		this.ordersState = ordersState;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
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
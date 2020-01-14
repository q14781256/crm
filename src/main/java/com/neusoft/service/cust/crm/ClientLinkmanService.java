package com.neusoft.service.cust.crm;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import com.neusoft.entity.ClientInfo;
import com.neusoft.entity.ClientLinkman;

public interface ClientLinkmanService {
	
	public int insertClientLinkman(ClientLinkman clientLinkman);
	
	public  int deleteClientLinkman(ClientLinkman clientLinkman);
	
	public int updateClientLinkman(ClientLinkman clientLinkman);
}

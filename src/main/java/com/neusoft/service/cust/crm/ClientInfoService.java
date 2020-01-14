package com.neusoft.service.cust.crm;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import com.neusoft.entity.ClientInfo;

public interface ClientInfoService {
	public List<ClientInfo> selectClientInfo();
	
	
//	public int insertClientInfo(ClientInfo clientInfo);
	
	public int deleteClientInfo(ClientInfo clientInfo);
	
	
	public int updateClientInfo(ClientInfo clientInfo);
	
	
	
}

package com.neusoft.controller.cust.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.entity.ClientInfo;
import com.neusoft.service.cust.crm.ClientInfoService;


@Controller
public class ClientInfoController {
	
	@Autowired
	private ClientInfoService clientInfoService;
	
	@RequestMapping("deleteClientInfo")
	public int deleteClientInfo(@RequestBody ClientInfo clientInfo)throws Exception{
		return clientInfoService.deleteClientInfo(clientInfo);
	}
	@RequestMapping("updateClientInfo")
	public int updateClientInfo(@RequestBody ClientInfo clientInfo)throws Exception{
		return clientInfoService.updateClientInfo(clientInfo);
	}
	
	@RequestMapping("selectClientInfo")
	public List<ClientInfo> selectClientInfo()throws Exception{
		return clientInfoService.selectClientInfo();
	}
}

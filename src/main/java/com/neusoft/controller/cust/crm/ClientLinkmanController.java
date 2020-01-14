package com.neusoft.controller.cust.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.entity.ClientLinkman;
import com.neusoft.entity.ClientReprieveLose;
import com.neusoft.service.cust.crm.ClientLinkmanService;

@Controller
public class ClientLinkmanController {
	
	@Autowired
	private ClientLinkmanService clientLinkmanService;
	
	
	@RequestMapping("insertClientLinkman")
	public  int  insertClientLinkman(@RequestBody ClientLinkman clientLinkman) throws Exception{
		return clientLinkmanService.insertClientLinkman(clientLinkman);
		
	} 
	
	@RequestMapping("updateClientLinkman")
	public  int  updateClientLinkman(@RequestBody ClientLinkman clientLinkman) throws Exception{
		return clientLinkmanService.updateClientLinkman(clientLinkman);
		
	} 
}

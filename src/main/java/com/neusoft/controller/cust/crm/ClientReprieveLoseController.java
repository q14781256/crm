package com.neusoft.controller.cust.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.entity.ClientReprieveLose;
import com.neusoft.service.cust.crm.ClientReprieveLoseService;

@Controller
public class ClientReprieveLoseController {
	
	@Autowired
	private ClientReprieveLoseService clientReprieveLoseService;
	
	@RequestMapping("updateClientReprieveLose")
	public  int  updateClientReprieveLose(@RequestBody ClientReprieveLose clientReprieveLose) throws Exception{
		return clientReprieveLoseService.updateClientReprieveLose(clientReprieveLose);
		
	} 
}

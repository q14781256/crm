package com.neusoft.service.cust.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.ClientReprieveLose;
import com.neusoft.mapper.cust.crm.ClientReprieveLoseMapper;
@Service
public class ClientReprieveLoseServiceImpl implements ClientReprieveLoseService {
	
	@Autowired
	private ClientReprieveLoseMapper clientReprieveLoseMapper;
	
	@Override
	public int updateClientReprieveLose(ClientReprieveLose clientReprieveLose) {
		// TODO Auto-generated method stub
		return clientReprieveLoseMapper.updateClientReprieveLose(clientReprieveLose);
	}

}

package com.neusoft.service.cust.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.ClientLinkman;
import com.neusoft.mapper.cust.crm.ClientLinkmanMapper;
@Service
public class ClientLinkmanServiceImpl  implements ClientLinkmanService{
	
	@Autowired
	private ClientLinkmanMapper clientLinkmanMapper;
	
	@Override
	public int insertClientLinkman(ClientLinkman clientLinkman) {
		// TODO Auto-generated method stub
		return clientLinkmanMapper.insertClientLinkman(clientLinkman);
	}

	@Override
	public int deleteClientLinkman(ClientLinkman clientLinkman) {
		// TODO Auto-generated method stub
		return clientLinkmanMapper.deleteClientLinkman(clientLinkman);
	}

	@Override
	public int updateClientLinkman(ClientLinkman clientLinkman) {
		// TODO Auto-generated method stub
		return clientLinkmanMapper.updateClientLinkman(clientLinkman);
	}

}

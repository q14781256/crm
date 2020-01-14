package com.neusoft.service.cust.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.ClientInfo;
import com.neusoft.mapper.cust.crm.ClientInfoMapper;
@Service
public class ClientInfoServiceImpl implements ClientInfoService {
	
	@Autowired
	private ClientInfoMapper clientInfoMapper;
	
	@Override
	public List<ClientInfo> selectClientInfo() {
		// TODO Auto-generated method stub
		return clientInfoMapper.selectClientInfo();
	}

	@Override
	public int deleteClientInfo(ClientInfo clientInfo) {
		// TODO Auto-generated method stub
		return clientInfoMapper.deleteClientInfo(clientInfo);
	}

	@Override
	public int updateClientInfo(ClientInfo clientInfo) {
		// TODO Auto-generated method stub
		return clientInfoMapper.updateClientInfo(clientInfo);
	}

}

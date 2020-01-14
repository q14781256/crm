package com.neusoft.mapper.cust.crm;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.entity.ClientInfo;
@Mapper
public interface ClientInfoMapper {
	
	@Select("selete * from clientInfo ")
	public List<ClientInfo> selectClientInfo();
	
	
//	public int insertClientInfo(ClientInfo clientInfo);
	
	@Delete("delete from clientInfo where clientCode=#{clientCode}")
	public int deleteClientInfo(ClientInfo clientInfo);
	
	
	@Update("update clientInfo set clientName=#{clientName},clientAreaId=#{clientAreaId},clientCustId=#{clientCustId},clientLevelId=#{clientLevelId},clientContentment=#{clientContentment},clientCredit=#{clientCredit},clientAddress=#{clientAddress},clientDakCode=#{clientDakCode},clientTel=#{clientTel},clientFax=#{clientFax},clientNet=#{clientNet},clientCharter=#{clientCharter},clientCorporation=#{clientCorporation},clientBankroll=#{clientBankroll},clientTurnoverYear=#{clientTurnoverYear},clientBank=#{clientBank},clientAccounts=#{clientAccounts},clientNativeTax=#{clientNativeTax},clientCountryTax=#{clientCountryTax},clientState=#{clientState},clientLoseReason=#{clientLoseReason},clientLoseDate=#{clientLoseDate}")
	public int updateClientInfo(ClientInfo clientInfo);
	
	
	
}

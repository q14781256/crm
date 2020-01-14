package com.neusoft.mapper.cust.crm;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.neusoft.entity.ClientReprieveLose;


@Mapper
public interface ClientReprieveLoseMapper {
	
	@Update("update clientReprieveLose set reprieveStep=#{reprieveStep},clientReprieveLoseId=#{clientReprieveLoseId}}")
	public int updateClientReprieveLose(ClientReprieveLose clientReprieveLose);
}
 
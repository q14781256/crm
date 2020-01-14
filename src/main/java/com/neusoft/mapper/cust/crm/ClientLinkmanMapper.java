package com.neusoft.mapper.cust.crm;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.neusoft.entity.ClientInfo;
import com.neusoft.entity.ClientLinkman;
@Mapper
public interface ClientLinkmanMapper {
	
	@Insert("insert into clientLinkman values(null,#{clientLinkmanName},#{clientLinkmanSex},#{clientLinkmanJob},#{clientLinkmanTel},#{clientLinkmanMobile},#{remark},#{clientCode})")
	public int insertClientLinkman(ClientLinkman clientLinkman);
	
	@Delete("delete from clientLinkman where clientLinkmanId=#{clientLinkmanId} ")
	public  int deleteClientLinkman(ClientLinkman clientLinkman);
	
	@Update("update clientLinkman set clientLinkmanName=#{clientLinkmanName},clientLinkmanSex=#{clientLinkmanSex},clientLinkmanJob=#{clientLinkmanJob}, clientLinkmanTel=#{clientLinkmanTel},clientLinkmanMobile=#{clientLinkmanMobile},remark=#{remark},clientCode=#{clientCode} where clientLinkmanId=#{clientLinkmanId}")
	public int updateClientLinkman(ClientLinkman clientLinkman);
}

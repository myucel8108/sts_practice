package kr.co.rland.web.repository;

import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.web.entity.UserInfo;

@Mapper
public interface LoginRepository{
	
	
	
	UserInfo findByIdPwd(String id, String pwd);
}

package kr.co.rland.web.repository;


import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.web.entity.RcmdMenu;
import kr.co.rland.web.entity.RcmdMenuView;

@Mapper
public interface RcmdMenuRepository {
	List<RcmdMenuView> findViewAllByMenuId(int menuId);

	RcmdMenu insert(RcmdMenu rcmdMenu);
	void delete(RcmdMenu rcmdMenu);
}	

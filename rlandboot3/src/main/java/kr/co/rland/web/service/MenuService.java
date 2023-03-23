package kr.co.rland.web.service;

import java.util.List;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;

public interface MenuService {
	

	List<Menu> getList();

	List<Menu> getList(int page); //페이지 부르기

	List<Menu> getList(int page, String query); //페이지, 쿼리

	List<Menu> getList(int page, Integer categoryId); //페이지, 카테고리

	List<Menu> getList(int page, Integer categoryId, String query); //페이지, 카테고리, 쿼리
	
	
	
	List<MenuView> getViewList();
	
	List<MenuView> getViewList(int page); //페이지 부르기

	List<MenuView> getViewList(int page, String query); //페이지, 쿼리

	List<MenuView> getViewList(int page, Integer categoryId); //페이지, 카테고리

	List<MenuView> getViewList(int page, Integer categoryId, String query); //페이지, 카테고리, 쿼리

	Menu getById(long id);
	
	void pointUp();

}

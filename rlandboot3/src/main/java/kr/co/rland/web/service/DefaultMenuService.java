package kr.co.rland.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.repository.MenuRepository;

@Service
public class DefaultMenuService implements MenuService {
	
	@Autowired
	private MenuRepository repository;
	
	public void setRepository(MenuRepository repository) {
		this.repository = repository;
	}




	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return repository.findAll(0, 10, "", 1, 3000, "regdate", "desc");
	}


	@Transactional
	@Override
	public void pointup() {
		Menu menu = new Menu();
		menu.setId(780L);
		menu.setPrice(5000);
		repository.update(menu);
		menu.setId(780L);
		menu.setPrice(300000);
		repository.update(menu);
		
	}




	@Override
	public List<Menu> getList(int page) {
		return null;
		// TODO Auto-generated method stub
		
	}




	@Override
	public List<Menu> getList(int page, String query) {
		return null;
		// TODO Auto-generated method stub
		
	}




	@Override
	public List<Menu> getList(int page, int categori) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Menu> getList(int page, String query, int categoriId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	@Override
	public List<MenuView> getViewList() {
		Integer page =1;
		Integer size =10;
		List<MenuView> list = repository.findViewAll(page, size, null, null, null, null, null);
		return list;
	}

	
	@Override
	public List<MenuView> getViewList(int page) {
		Integer size= 10;
		List<MenuView> list = repository.findViewAll(page, size, null, null, null, null, null);
		return list;
	}




	@Override
	public List<MenuView> getViewList(int page, String query) {
		Integer size= 10;
		List<MenuView> list = repository.findViewAll(page, size, query, null, null, null, null);
		return list;
	}




	@Override
	public List<MenuView> getViewList(int page, int categoryId) {
		Integer size= 10;
		List<MenuView> list = repository.findViewAll(page, size, null, categoryId, null, null, null);
		return list;
	}




	@Override
	public List<MenuView> getViewList(int page, String query, int categoryId) {
		Integer size =10;
		List<MenuView> list = repository.findViewAll(page, size, query, categoryId, null, null, null);
		return list;
	}

}

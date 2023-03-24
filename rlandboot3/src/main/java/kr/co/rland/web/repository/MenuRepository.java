package kr.co.rland.web.repository;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;

@Mapper
public interface MenuRepository {
	List<Menu> findAll();
	
	List<MenuView> findViewAll(
			Integer offset, 
			Integer size,
			String query,
			Integer categoryId,
			Integer price,
			String orderField,
			String orderDir);
	

	List<Menu> findAllByIds(List<Long> ids);
	//Integer : null 이 들어가는 정수형
	Menu findById(long id);
	Integer count(
			String query,
			Integer categoryId,
			Integer price
); //컬럼 개수 이게 있어야 페이지 구현 가능
	Menu insert(Menu menu);
	Menu update(Menu menu);
	void delete(long id);
}	

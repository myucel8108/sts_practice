package kr.co.rland.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.co.rland.web.entity.Menu;

@Mapper
public interface MenuRepository {
	@Select("select * from menu")
	List<Menu> findAll();
	@Select("select * from menu where id=${id}") //#과 $에 차이 id가 문자열이면 #은 문자열에 맞게 포함되고 $를 쓰면 안붙어줌 
	Menu findById(long id);
	Menu insert(Menu menu);
	Menu update(Menu menu);
	void delete(long id);

}



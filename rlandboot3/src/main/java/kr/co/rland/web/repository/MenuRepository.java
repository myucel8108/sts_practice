package kr.co.rland.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.co.rland.web.entity.Menu;

@Mapper //없어서 Mapper.xml이 읽어서 마이바티스객체에 담긴하는데 스프링 IOC는 읽을 수 없다.
public interface MenuRepository {

	List<Menu> findAll(
			Integer offset,
			Integer size);
	//#과 $에 차이 id가 문자열이면 #은 문자열에 맞게 포함되고 $를 쓰면 안붙어줌 
	Menu findById(long id);
	Menu insert(Menu menu);
	Menu update(Menu menu);
	void delete(long id);
						//자바에서 여러번 호출하는 것을 막기 위한 라이브러리에 방법
	List<Menu> findAllByIds(List<Long> ids);
	List<Menu> findAll();

}



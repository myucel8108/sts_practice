package kr.co.rland.web.repository.mybatis;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

//@Repository
public class MbMenuRepository implements MenuRepository {
	
	@Autowired
	private SqlSession session;
	//mybatis는 저장소를 따로 가지고 있다 Mapper라는 어노테이션을 사용했을 때 사실은 IOC 컨테이너를 사용하는 것이 아니다.
	//mybatis는 자기만에 Mapper 저장소가 따로 있어서 Mybatis는 따른 콩자루가 있다. 그래서 예전에는 IOC와 autowired를 할 수 없었다.
	//그래서 mybatis 컨테이너에서 IOC 컨테이너와 연결하기 위해 스프링지원 라이브러리를 추가했다. 
	// mybatis 콩자루에서 값을 꺼내오기 위한 sqlSession이 기본이였지만 라이브러리가 추가된 이후로는 autowired도 사용할 수 있다.

	@Override
	public List<Menu> findAll(Integer offset,
			Integer size,
			String query, 
			Integer categoryId,
			Integer price,	
			String orderField,
			String orderDir) {
		MenuRepository menudao=session.getMapper(MenuRepository.class);
		//mapper 콩자루에서 가져오는 방식
		return menudao.findAll(offset,size,query, categoryId, price, orderField, orderDir);
	}

	@Override
	public Menu findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu insert(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu update(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}



}

package kr.co.rland.web.repository.jdbc;

import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

import org.junit.jupiter.api.Test;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

class JdbcMenuRepositoryTest {

	@Test
	void testFindAll() {

		int id =1;
		
		assertEquals(1,id);//가져온 값과 비교하면서 하는 방법
		//함수를 테스트해보고 싶을 때 사용하는 것
		MenuRepository repository = new JdbcMenuRepository();
		List<Menu> list =  repository.findAll();
		
		System.out.println(list.size());
		assertNull(repository.findAll());
	}

}

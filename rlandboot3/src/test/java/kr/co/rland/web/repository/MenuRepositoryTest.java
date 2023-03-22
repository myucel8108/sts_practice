package kr.co.rland.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.rland.web.entity.Menu;

@AutoConfigureTestDatabase(replace = Replace.NONE)
//@MybatisTest
@AutoConfigureMybatis
@SpringBootTest
class MenuRepositoryTest {
//	1.Spring load(IOC Container가 실행돼야함)
//	2.Mybatis가 일을 해야함
	
	@Autowired
	private MenuRepository repository;

	@Test
	void testFindAll() {
		List<Menu> list = repository.findAll(0, 10, null, null, null, null, null);
//		Menu list = repository.findById(753L);
		System.out.println(list);
//		System.out.println(repository);
	}

//	@Test
	void testUpdate() {
		Menu menu = new Menu();
		menu.setId(856L);
		menu.setName("아마아마리카노");

		repository.update(menu);
	}

//	@Test
	void testFindAllByIds() {
		List<Long> ids = new ArrayList<>();
		ids.add(616L);
		ids.add(617L);
		ids.add(713L);

		List<Menu> list = repository.findAllByIds(ids);
		System.out.println(list);
	}
	
//	@Test
	void testCount() {
		Integer count = repository.count(null, null, null);
		System.out.println(count);
//		assertEquals
	}

}

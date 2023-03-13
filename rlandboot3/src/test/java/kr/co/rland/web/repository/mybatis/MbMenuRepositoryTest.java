package kr.co.rland.web.repository.mybatis;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@MybatisTest
class MbMenuRepositoryTest {

	
	@Autowired
	private MenuRepository repository;
	
//	@Test
//	void testFindAll() {
//	//assertNull(repository); //null인지 판별
//		List<Menu> list=	repository.findAll(0, 10);
//		System.out.println(list);
//	}

//	@Test
//	void testUpdate() {
//		Menu menu = new Menu();
//		menu.setId(856);
//		menu.setName("내가만든쿠키");
//		 Menu m=repository.update(menu);
//		System.out.println(m);
//	}

	@Test
	void testFindAllByIds() {
		List <Long> ids= new ArrayList<>();
		ids.add(616L);
		ids.add(617L);
		ids.add(713L);
		ids.add(737L);
		
		List<Menu> list= repository.findAllByIds(ids);
		System.out.println(list);
		
	}
}

package kr.co.rland.web.repository;

import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import kr.co.rland.web.entity.RcmdMenu;
import kr.co.rland.web.entity.RcmdMenuView;



@AutoConfigureTestDatabase(replace = Replace.NONE)
@MybatisTest
class RcmdMenuRepositoryTest {

	@Autowired
	private RcmdMenuRepository rcmdMenuRepository;
	
	@Test
	void test() {
	List<RcmdMenuView> list = rcmdMenuRepository.findViewAllByMenuId(617);
	System.out.println(list);
	}

//	@Test
//	void test2() {
//		RcmdMenu rcmd = new RcmdMenu(617,999);
//		rcmdMenuRepository.insert(rcmd);
//	}
//	@Test
//	void test3() {
//		RcmdMenu rcmd = new RcmdMenu(617,999);
//		rcmdMenuRepository.delete(rcmd);
//	}

}

package kr.co.rland.web.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DefaultMenuServiceTest {
	
	@Autowired
	private MenuService service;
	
	@Test
	void test() {
		service.pointup();
		System.out.println("시스템가동 준비완료");
	}
	

}

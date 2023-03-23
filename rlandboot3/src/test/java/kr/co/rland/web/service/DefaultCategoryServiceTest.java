package kr.co.rland.web.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class DefaultCategoryServiceTest {

	@Autowired
	private DefaultCategoryService service;
	
	@Test
	void test() {
		String a =service.getNameById(617);
		System.out.println(a);
		
	}

	
}

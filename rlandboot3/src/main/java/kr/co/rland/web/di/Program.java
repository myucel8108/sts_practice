package kr.co.rland.web.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;
import kr.co.rland.web.service.DefaultMenuService;
import kr.co.rland.web.service.MenuService;

public class Program {
	public static void main(String[] args) {
		//사용자의 지시서 xml과 어노테이션을 통해서 DI를 연습할예정
	ApplicationContext context = new ClassPathXmlApplicationContext("kr/co/rland/web/di/context.xml");
/*	MenuRepository menuRepository =context.getBean(MenuRepository.class);
	
	List<Menu> list = menuRepository.findAll();*/
	
	MenuService service = context.getBean(MenuService.class);
		
	List<Menu> list = service.getList();
	
	System.out.println(list);
	
	}

}

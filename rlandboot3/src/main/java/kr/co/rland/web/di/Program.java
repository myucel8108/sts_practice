package kr.co.rland.web.di;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.rland.web.entity.JSONParser;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;
import kr.co.rland.web.service.DefaultMenuService;
import kr.co.rland.web.service.MenuService;

public class Program {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		//어노테이션 기반에 DI
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		String hello = (String) context.getBean("hello");
		
		System.out.println(hello);
		//4가지 application context
		
	}

}

package kr.co.rland.web.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.rland.web.repository.jdbc.JdbcMenuRepository;

// 스프링이 제공하는 객체 생성 어노테이션
/*@Component
@Controller
@Service
@Repository*/

//@Configuration
public class Config {
	
//	@Bean
//	public JdbcMenuRepository repository() { //객체를 만들기위한 코드를 만들어내지만 스프링처리기가 콩자
//		//원래는 객체를 만들어서 return하는 방식
//		//스프링에서는 콩자루에 담겨줄거기 때문에 객체를 만드는 것이 아닌 함수명만 지어준 것이 된다.
//		//객체를 만들어달라는 xml과 똑같은 방식이다.
//		
//				
//		return new JdbcMenuRepository();
//	}
	@Bean
	public List list() {
		
		return new ArrayList<>();
	}
	
	@Bean
	public String hello() {
		
		return "hello 콩자루";
	}
}

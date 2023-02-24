package kr.co.rland.web.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController { //pojo는 마음대로 만들어도 된다.!
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello Boot";
	}

	

	
}

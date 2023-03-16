package kr.co.rland.web.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/menu/")
public class MenuController {

	
	@RequestMapping("list")
	public String list() {
		
		return "menulist";//타일즈에게 내가 조립한 것을 줘야한다. 근데? 저런 페이지가 있는줄알고 스프링은 타일즈가 아닌 menulist라는 파일을 찾게 될것이다. 
		//타일즈로 했다는걸 알려줄려면
		//return  "/WEB-INF/view/Inc/layout.jsp";
		
		//return  "/WEB-INF/view/menu/list.jsp";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "detail";
	}
	

}

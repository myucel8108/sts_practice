package kr.co.rland.web.contorller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller("adminMenuController")
@RequestMapping("/admin/menu")
public class MenuController {
	
	@RequestMapping("list")
	public String list() {
		return "/WEB-INF/view/admin/menu/list.jsp";
	}
	@RequestMapping("detail")
	public String detail() {
		return "detail";
	}
	//메뉴등록의 대표적인 예시
	
	//1.등록폼을 주세요
	//@RequestMapping("reg") //->service():Get/post 다 처리하는 매핑
	@GetMapping("reg")
	public String reg() {
		return"/WEB-INF/view/admin/menu/reg.jsp";
	}
	//2.폼입력해서 제출이요
	@PostMapping("reg") 
	public String reg(String title) {
		System.out.println("메뉴등록완료");
		return"redirect:list";
	}

}

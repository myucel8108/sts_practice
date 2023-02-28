package kr.co.rland.web.contorller.admin;

import java.io.UnsupportedEncodingException;

import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import kr.co.rland.web.repository.MenuRepository;


@Controller("adminMenuController")
@RequestMapping("/admin/menu")
public class MenuController {
	
	/*
	 * private MenuRepository menuRepository;
	 * 
	 * public MenuController() {
	 * 
	 * }
	 * 
	 * 
	 * public MenuController(MenuRepository menuRepository) { super();
	 * 
	 * }
	 * 
	 * @Autowired public void setMenuRepository(MenuRepository menuRepository) {
	 * this.menuRepository = menuRepository; }
	 */
	
	
	@RequestMapping("list")
	public String list(
			@RequestParam(name= "p" ,defaultValue = "1") int page ,
			@RequestParam(name ="q" , required = false ) String qurey
				, HttpServletRequest req
				, @CookieValue("my") String myCookie
			) throws UnsupportedEncodingException {
//		String 	mycookie = "";
//		Cookie[] cookies = req.getCookies();
//			for(Cookie cookie: cookies) {
//				if(cookie.getName().equals("my"))
//				mycookie = cookie.getValue();
//				break;
//			}
		myCookie = URLDecoder.decode(myCookie, "utf-8");
		System.out.println(myCookie);

		System.out.println(page);
		System.out.println(qurey);
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

package kr.co.rland.web.controller.admin;


import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.security.Security;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.rland.web.config.RlandUserDetails;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.MenuService;

// 이름 설정을 admin 안붙여서 안해놓으면 일반위의 MenuController랑 이름이 겹치게 돼서 오류남.
@Controller("adminMenuController")
@RequestMapping("/admin/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;


	@GetMapping("list")
	public String list(
			@RequestParam(name="p", defaultValue = "1") int page,
			@RequestParam(name="c", required = false) Integer categoryId,
			@RequestParam(name="q", required = false) String query,
			Model model			
			) throws UnsupportedEncodingException {
			
		
		List<MenuView> list = service.getViewList(page, categoryId, query);
		model.addAttribute("list",list);
		
		return "admin/menu/list";
	}
	
	@GetMapping("detail")
	public String detail(
			long id,
			Model model) {
		
			Menu menu = service.getById(id);
			model.addAttribute("menu",menu);
		return "admin/menu/detail";
	}
	
	// .admin/menu/
	// /admin/leg/html
	
	// 등록품을 주세요
//	@RequestMapping("reg") //->service():Get/post를 내가 다 처리하는 매핑
//	@GetMapping("reg")
//	public String reg() {
//		return "/WEB-INF/view/admin/menu/reg.jsp";
//	}
//	
	// 폼입력해서 제출이요
//	@RequestMapping("reg")
	@PostMapping("reg")
	public String reg(String title,
			Authentication authentication,
			Principal principal
			) {
	
		RlandUserDetails user = (RlandUserDetails) authentication.getPrincipal();
		System.out.println(user.getEmail());
		//4번째방식
		//UserDetails user = (UserDetails) authentication.getPrincipal();
		
	//3번째방식
		//System.out.println(principal.getName());
		
		//2번쨰 방식
//		String username = authentication.getName();
//		System.out.println(username);
		
		//1번쨰 방식
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		String currentPrincioalNmae = authentication.getName();
//		System.out.println(currentPrincioalNmae);
		// 등록하고r
		System.out.println("메뉴 등록 완료");
		return "redirect:list";
	}
}

package kr.co.rland.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.entity.RcmdMenuView;
import kr.co.rland.web.service.CatagoryService;
import kr.co.rland.web.service.MenuService;
import kr.co.rland.web.service.RcmdMenuService;

// 이걸 안써두면 스프링이 안읽음.
//@RestController

@Controller
// 반복되는 상위 주소들은 이렇게 맵핑 주소 적어서 축약시킬 수 있다.
@RequestMapping("/menu")

public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@Autowired
	private CatagoryService categoryService;
	
	@Autowired
	private RcmdMenuService rcmdMenuService;
	
	@GetMapping("list")
	public String list(Model model,
			@RequestParam(name="p", defaultValue = "1", required = false) int page,
			@RequestParam(name="c", required = false) Integer categoryId, //category값은 null값이 들어올 수 있도록!!
			@RequestParam(name="q", required = false) String query) {
		List<Category> categoryList = categoryService.getList();
		model.addAttribute("category",categoryList);
//		System.out.println(categoryList);
		List<MenuView> list = service.getViewList(page, categoryId, query);
		model.addAttribute("list",list);
//		service.getViewList(); //1, query:"" , category: null
//		service.getList(1); //페이지
//		service.getList(1,"아"); //페에지,쿼리
//		service.getList(1,1); //페이지,카테고리
//		service.getList(1,1,"아"); //페이지,카테고리,쿼리
		
		
//		List<MenuView> list = service.getViewList();
//		System.out.println(list);
		return "menu/list2"; //Tiles에게 조립 하고픈 목록 주고 조립해달라 해야함
	}
	
	@GetMapping("detail")
	public String detail(int id, Model model) {
		
//		String categoryName = service.getCategoryNameById(id);
		
//		int cateCount = categoryService.getCountByName();
		
		Menu menu = service.getById(id);	
		
		String categoryName = categoryService.getNameById(menu.getCategoryId());
		
		
		List<RcmdMenuView> rcmdMenuList =  rcmdMenuService.getViewListByMenuId(id);
		model.addAttribute("categoryName",categoryName);
		model.addAttribute("menu",menu);
		model.addAttribute("rcmdMenuList",rcmdMenuList);
		return "menu/detail2";
	}
	
	
}

package kr.co.rland.web.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.MenuService;

@Controller
@RequestMapping("/menu/")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<MenuView> list = service.getViewList();
		model.addAttribute("list",list);
		model.addAttribute("data","Hello");
		
		return "menu/list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "menu/detail";
	}
	

}

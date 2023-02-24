package kr.co.rland.web.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {

	
	@RequestMapping("list")
	public String list() {
		return "list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "detail";
	}
	

}

package kr.co.rland.web.controller.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController("apiMenuController")	//이름을 명시해주면 충돌이 발생하지 않는다.
@RequestMapping("/menus")
public class MenuController {
	
	@GetMapping("/")
	public String getList(){  //원래는 문서 url이 와야하는데..? restcontroller에게 요청하면 데이터를 받는다! url를 받는것이 아니다. 
									 //객체는 json형식으로 바꿔서 보내준다.
		
		return "menu List"; //전에는 /menu/list라고url처럼 줬는데 지금은 왜 저런방식으로 주나?-> 데이터를 달라는 거기 때문에 
		//menu/list->이러한 페이지를 줘
		//restController는 ->data /menus->메뉴 목록을 받음
		//menus/3->메뉴에서 3번째를 달라 menu?id=3과 비슷
		//restcontoller는 메서드의 방식으로 사용하기때문에 url이 같다!
	}
	@GetMapping("/3")
	public String get(int id){  
		
		return "menu 3"; 
	}
	@PutMapping("/3")
	public String edit(int id){  
		return "menu edit";
	}
	@DeleteMapping("/")
	public String delete(int id){ 
		return "menu del";
	}
	@PostMapping("/")
	public String intsert(){  
		
		return "menu insert"; 
	}
	
	
}

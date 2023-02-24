package kr.co.rland.web.contorller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller("/")
public class HomeController { //pojo는 마음대로 이름을 설정해도된다. 만들어도 된다.!
	
	
	@PostMapping("upload")
	@ResponseBody  //뷰를 하는것이 아닌 데이터만 보내는 것
	public String upload(MultipartFile img) { //지금 이런상황이면 문자열만 보내진다. 기본타입이 보내질 때는 URl이 가능한 형태만 가능합 그래서 타입을 바꿔줘야함
		
		System.out.println(img); 
		System.out.println(img.getOriginalFilename());
		return "ok";
	}
	
	@RequestMapping("index")
	public String hello(Model model, HttpServletResponse response) throws UnsupportedEncodingException {
		
		String data= URLEncoder.encode("내가 만든 쿠키~ 너를 위해 구웠지","utf-8");
		System.out.println(data);
		Cookie  cookie = new Cookie("my", data);
		//문제가 생기는 이유: 서블릿꺼라서 다시 방을 혼합하게 쓰는 것
		//애석하게도 지원은 되지않아서 response를 써야한다..

		
		response.addCookie(cookie);
		
		model.addAttribute("data", data);
		
		return "/WEB-INF/view/index.jsp";
	}

	

	
}

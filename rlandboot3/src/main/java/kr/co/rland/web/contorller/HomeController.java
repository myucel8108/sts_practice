package kr.co.rland.web.contorller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
	public String upload(MultipartFile[] imgs, HttpServletRequest request) throws IOException { //지금 이런상황이면 문자열만 보내진다. 기본타입이 보내질 때는 URl이 가능한 형태만 가능합 그래서 타입을 바꿔줘야함
		//여러 파일을 받을 때는 배열 아니면 리스트 둘중하나만 해야한다.
		
		
		for(int i =0; i<imgs.length; i++){
			
		MultipartFile img = imgs[i];
		 if(img.isEmpty())
			 continue;
		String urlPath="/image/menu/"+img.getOriginalFilename(); //spring.servlet.multipart.file-size-threshold= 1MB: 메모리가 아닌 1MB이상이면 하드 디스크를 사용하게 명령어를 쓰지않고 사용자는 디렉터리구종달을 기쁘
		String realPath = request.getServletContext().getRealPath(urlPath); //main 폴더의 기준임 하지만 이렇게 알아내면 request라는 도구를 얻어내야함-> 프론트 컨트롤러가 모든것을 걷어낼 수는 없다.
		
		//realPath= this.getClass().getResource("").getPath();
		
//		OutputStream fos= new FileOutputStream(realPath);
//		InputStream fis = img.getInputStream();
//		//img.transferTo(new File(realPath));
//		byte[] buf = new byte[1024];
//		int size = 1024;
//		while((size =fis.read(buf))!=-1) {
//			fos.write(buf,0,size);
//			
//		}
//		fis.close();
//		fos.close();
//		return "ok";
		img.transferTo(new File(realPath));
	}
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

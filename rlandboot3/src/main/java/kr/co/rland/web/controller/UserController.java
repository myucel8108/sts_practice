package kr.co.rland.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import kr.co.rland.web.service.MemberService;

//import kr.co.rland.web.service.MemberService;

@Controller
@RequestMapping("/user")
public class UserController {
   
   @Autowired
   private MemberService memberService;
   
   @GetMapping("login")
   public String login() {

      return "user/login";
   }
   
   @PostMapping("login")
   public String login(String uid,
		   String pwd
		   ,HttpSession session,
		   String returnURL
		   ) {

//      Member member = memberService.getByUserName(uid);
      boolean isValid = memberService.isValidMember(uid,pwd);
      System.out.println(isValid);
      
      if(isValid) {
    	  session.setAttribute("username",uid);
    	  if(returnURL !=null)
    		  return "redirect:"+returnURL;
    	  return "redirect:/index";
      }
      
      return	"redirect:login?error=123123"; //redirect를 사용해야하는 이유-> 잘 안되면 다시 로그인을 하는것이고 또 post는 페이지를 주면 안된다!
      //post는 페이지를 주는 것이아니다!
      //아이디 또는 비밀번호가 일치하지 않다고 적어야만 한다 이유는 다른 사람의 해킹 가능성이 있기떄문에
      //예전에는 아이디 비밀번호를 자세하게 알려줬지만 요새는 그러면 해킹의 위험이 높아진다.
      
   }

}
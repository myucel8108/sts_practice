package kr.co.rland.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.web.entity.Member;
import kr.co.rland.web.repository.MemberRepository;

@Service
public class DefaultMemberService implements MemberService {

   @Autowired
   private MemberRepository repository;
   
   @Override
   public boolean isValidMember(String uid, String pwd) {

      Member member = repository.findByUserName(uid);
      if(member ==null)
    	  return false;
      
      else if(!member.getPwd().equals(pwd)) //안되는 이유 확인
    	  return false;
      
      return true;
   }

}
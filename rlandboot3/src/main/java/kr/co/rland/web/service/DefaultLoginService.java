package kr.co.rland.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.web.dto.SampleLogin;
import kr.co.rland.web.entity.UserInfo;
import kr.co.rland.web.repository.LoginRepository;

@Service
public class DefaultLoginService implements LoginService {
	
	@Autowired
	private LoginRepository repository;

	public void setRepositoy(LoginRepository repositoy) {
		this.repository = repositoy;
	}

	@Override
	public void Login(SampleLogin inputLogin) {

		
		UserInfo dbUser = repository.findByIdPwd(inputLogin.getId(), inputLogin.getPwd());
		System.out.println(dbUser);
	}

}

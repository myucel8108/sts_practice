package kr.co.rland.web.service;

import kr.co.rland.web.dto.SampleLogin;
import kr.co.rland.web.entity.UserInfo;

public interface LoginService {
	void Login(SampleLogin inputLogin);
}

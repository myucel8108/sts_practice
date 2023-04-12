package kr.co.rland.web.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import kr.co.rland.web.entity.Member;

@Configuration
public class RlandSecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.
		authorizeHttpRequests().requestMatchers("/admin/**").hasAnyRole("ADMIN")
		.requestMatchers("/member/**").hasAnyRole("ADMIN","MEMBER")
		.anyRequest().permitAll()
		.and().formLogin()
		.loginPage("/user/login");
	
		//role과 Auth의 차이
		//둘이 같지만 달라지는거 
		
		return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		
		return new BCryptPasswordEncoder();
	}
	
	
	// 사용자 데이터 서비스의 종류
	//1. 인메모리 서비스
	//2. JDBC  서비스
	//3. LDAP 서비스
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails newlec = User.builder().username("newlec").password("$2a$10$H.HXCEd59CmUnp9luiKHwestJxuSIGRsJZNzCWfTfpJPgk6VGLm3O").roles("ADMIN","MEMBER").build();
		//여기서의 빌드는 롬복에게 어떤 영향을 줄까
		
		
		UserDetails dragon = User.builder().username("dragon").password(passwordEncoder().encode("111")).roles("ADMIN","MEMBER").build();
		//Member member= Member.builder().id//원래 만드는 방식이 아닌 직접 빌드를 만들어도됨
		//인증정보를 담아야하는 것이 필요하다!
		return new InMemoryUserDetailsManager(newlec,dragon);
	}

}

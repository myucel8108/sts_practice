package kr.co.rland.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


@Configuration
public class TilesConfig {
	//우리가 타일즈를 객체화 하는 작업
	//1.내가만든web-inf에 xml에 객체화하고-> 메모리에 올린다.
	@Bean
	public UrlBasedViewResolver tilesViewResolver() { 
		//역할자 resolver:누군가가 명령을 내리면 내부명령-> 외부명령 실행할수 있는 파일-> 배치파일의 dos처럼 명령어를 찾아나서는 역할을 한다.
		//defaultresolver는 기본 리졸버고 
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setViewClass(TilesView.class);
		
		return resolver;
		
	}
	//2. 실질적인 tiles를 깨워야한다. ->tiles resolver를 만들어서 ico에 담는다고 생각하면된다.  왜냐하면 컨트롤러가 반환하는건 view이기때문이다.
	@Bean
	   public TilesConfigurer tilesConfigurer() {
		   System.out.println("tiles");
	      TilesConfigurer tilesConfigurer = new TilesConfigurer();
	      tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/tiles.xml"}); //xml파일 위치
	      tilesConfigurer.setCheckRefresh(true);
	      //ViewPreparer에서 Autowired가 가능하게 하는 설정
	      tilesConfigurer.setPreparerFactoryClass(SimpleSpringPreparerFactory.class);
	      return tilesConfigurer;
	   }
	

}

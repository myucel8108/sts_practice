package kr.co.rland.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //이패키지 이하에 어노테이션을 다 읽게 한다. -> 스캔 범주라고 생각하면된다.
//@ComponentScan 이건 스캔 범주에 범위를 정하는 것
public class Rlandboot3Application {

	public static void main(String[] args) { 
		SpringApplication.run(Rlandboot3Application.class, args); //톰캣을 시작해주는 것
		
	}

}

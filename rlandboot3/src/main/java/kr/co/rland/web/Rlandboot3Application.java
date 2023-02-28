package kr.co.rland.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class Rlandboot3Application {

	public static void main(String[] args) { 
		SpringApplication.run(Rlandboot3Application.class, args); //톰캣을 시작해주는 것
		
	}

}

package kr.co.rland.web.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //생명주기만 정해주는것 뿐 처리기가 정리한다.
@Target(ElementType.FIELD) //필드로만 사용하겠다.
public @interface Column { //어노테이션정의하기
	String value();

}

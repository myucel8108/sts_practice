package kr.co.rland.web.entity;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RcmdMenuView extends RcmdMenu {
	//extends한 클래스의 경우 빌더와 data를 사용할 수 없다.
	private String img;
	private String name;
}

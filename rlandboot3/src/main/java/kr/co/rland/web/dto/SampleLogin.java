package kr.co.rland.web.dto;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

public class SampleLogin {
	@NotNull
	private String id;
	@NotNull
	private String pwd;
//	생성자
	public SampleLogin(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
//	Getters/Setters
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
//	toString
	@Override
	public String toString() {
		return "SampleLogin [id=" + id + ", pwd=" + pwd + "]";
	}
	
	
	
	
	
}

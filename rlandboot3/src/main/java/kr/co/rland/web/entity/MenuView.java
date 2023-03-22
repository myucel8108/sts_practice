package kr.co.rland.web.entity;

import java.util.Date;
//View를 담기 위한 model --> 카테고리와 메뉴를 합친 뷰를 얻어 데이터를 뽑아와야되기때문
public class MenuView extends Menu{
	private String categoryName;

	
//	생성자
	public MenuView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuView(String name, Integer price, Integer categoryId, String categoryName) {
		super(name, price, categoryId);
		this.categoryName = categoryName;
	}
	

	public MenuView(Long id, String name, Integer price, String img, Date regDate, Integer categoryId,
			Long regMemberId, String categoryName) {
		super(id, name, price, img, regDate, categoryId, regMemberId);
		// TODO Auto-generated constructor stub
		this.categoryName = categoryName;
	}

	public MenuView(String name, Integer price, String img, Integer categoryId, Long regMemberId,String categoryName) {
		super(name, price, img, categoryId, regMemberId);
		// TODO Auto-generated constructor stub
		this.categoryName = categoryName;
	}
	
	
//	Getters Setters
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
//	toString
	@Override
	public String toString() {
		return "MenuView [categoryName=" + categoryName + "]";
	}
	
	
}
//아우터 -> 결함 -> 부모의 외래키가없는놈들 찾기


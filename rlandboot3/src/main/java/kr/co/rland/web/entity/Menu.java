package kr.co.rland.web.entity;

import java.util.Date;

public class Menu { //db와 연결된 그릇 -> 생성자 기본생성자 getter setter tostring

	private long id;
	private String name;
	private int price;
	private Date regDate;
	private int categoryId;
	private long regMemberId;



	public Menu(String name, int price, int categoryId) {
		super();
		this.name = name;
		this.price = price;
		this.categoryId = categoryId;
	}



	public Menu(long id, String name, int price, Date regDate, int categoryId, long regMemberId) {
		//모든 데이터를 가져오는 데이터
		this.id = id;
		this.name = name;
		this.price = price;
		this.regDate = regDate;
		this.categoryId = categoryId;
		this.regMemberId = regMemberId;
	}
	


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public long getRegMemberId() {
		return regMemberId;
	}
	public void setRegMemberId(long regMemberId) {
		this.regMemberId = regMemberId;
	}
	
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", price=" + price + ", regDate=" + regDate + ", categoryId="
				+ categoryId + ", regMemberId=" + regMemberId + "]";
	}
	
	
	
}

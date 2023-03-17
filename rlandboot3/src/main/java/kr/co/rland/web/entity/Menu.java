package kr.co.rland.web.entity;

import java.util.Date;

public class Menu { //db와 연결된 그릇 -> 생성자 기본생성자 getter setter tostring

	private Long id;

	private String name;
	private Integer price;
	private String img;
	@Column(value = "reg_Date")
	private Date regDate;
	private Integer categoryId;
	private long regMemberId;
	
	public Menu(String name, Integer price, String img, Integer categoryId, long regMemberId) {
		super();
		this.name = name;
		this.price = price;
		this.img = img;
		this.categoryId = categoryId;
		this.regMemberId = regMemberId;
	}

	public Menu() {

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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public long getRegMemberId() {
		return regMemberId;
	}

	public void setRegMemberId(long regMemberId) {
		this.regMemberId = regMemberId;
	}

	public Menu(long id, String name, Integer price, String img, Date regDate, Integer categoryId, long regMemberId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.img = img;
		this.regDate = regDate;
		this.categoryId = categoryId;
		this.regMemberId = regMemberId;
	}

	public Menu(String name, Integer price, Integer categoryId) {
		super();
		this.name = name;
		this.price = price;
		this.categoryId = categoryId;
	}
	

	

	
}

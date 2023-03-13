package kr.co.rland.web;

public class DefaultCalculator implements Calculator {
	
	private int x;	
	private int y;
	
	public DefaultCalculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int plus() {
		// TODO Auto-generated method stub
		int result = this.x+this.y;
		return x+y;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int multi() {
		// TODO Auto-generated method stub
		return x*y;
	}

}

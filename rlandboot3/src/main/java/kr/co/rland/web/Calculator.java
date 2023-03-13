package kr.co.rland.web;

public interface Calculator {
	//계산을 하기 위해 덧셈 뺄셈을 할수도 있다
//	int plus(int x , int y) { //표출할때마다 값이 달라지는것
//		
//	}
	int plus();//한번설정하면 그대로 유지
	int sub();
	int multi();

}

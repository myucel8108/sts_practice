package kr.co.rland.web;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Program {
	public static void main(String[] args) {
		   Calculator calc = new DefaultCalculator(3,4);
		   
		   //진짜를 대신할 가짜를 만들려고 하는중
		   Calculator 가짜 =(Calculator) Proxy.newProxyInstance(
				   DefaultCalculator.class.getClassLoader()//구현해야할 구현체
				   , new Class[] {Calculator.class}//구현하고있는 인터페이스
				   , (Object proxy, Method method, Object[] ags) -> {
						// TODO Auto-generated method stub

					   System.out.printf("함수호출전 %s\n" ,method.getName());
					   Object result = method.invoke(calc, args);
							   System.out.printf("결과값 %d\n",result);
							   System.out.printf("함수호출후 %s\n" ,method.getName());
							
						return 5;
					}
				);
		      
		      int result = 0;
		      result = 가짜.plus();
		      System.out.printf("plus result : %d\n", result);
		      result = 가짜.sub();
		      System.out.printf("sub result : %d\n", result);
		      result = 가짜.multi();
		      System.out.printf("multi result : %d\n", result);
		      
		      
	
}	
}

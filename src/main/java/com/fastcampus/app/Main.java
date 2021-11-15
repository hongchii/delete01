package com.fastcampus.app;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception{
		
		// Reflection API를 사용 - 클래스 정보를 얻고 다룰 수 있는 강력한 기능 제공.
		Class helloClass = Class.forName("com.fastcampus.FirstSpring.Hello");
		Hello hello = (Hello)helloClass.newInstance();
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); 
		
		main.invoke(hello); // hello.main()
	}

}

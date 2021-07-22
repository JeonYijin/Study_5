package com.ae.ae3;

public class StaticTest {
	
	//접근지정자 [그외지정자] 데이터타입 변수명
	public static int num =10;
	public int num2 =20;
	
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수]){}
	public static void staticMethod() {
		System.out.println("Static Method");
		System.out.println(StaticTest.num);
		//System.out.println(this.num2);
		//this.instanceMethod();
		
	}
	
	public void instanceMethod() {
		System.out.println("Instance Method");
		System.out.println(StaticTest.num);
		System.out.println(this.num2);
		
		//this() - 생성자를 호출
		//참조변수명.메서드명();
		StaticTest.staticMethod();
		
	}
	
	
}	

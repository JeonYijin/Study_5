package com.ae.ae2.ex1;

public class Member {
	
	private String id; //멤버변수는 앞으로 private으로 지정하고 get, set메서드 사용
	private int age;
	private int muge;
	private int ki;
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	//외부데이터를 멤버변수에 대입
	//데이터를 입력하는 메서드는 set멤버 변수명
	public void setAge(int age) {
		if(age>0 && age<150) {
			this.age = age;
		}else {
			this.age = 20; 
		}
		
	}
	
	//멤버변수를 외부로 보낼 때
	//데이터를 외부로 내보낼 때 get멤버변수명
	public int getAge() {
		//if()
		return this.age;
	}
	
	
	public void setMuge(int muge) {
		this.muge = muge;
	}
	
	public int getMuge() {
		return this.muge;
	}
	
	public void setKi(int ki) {
		this.ki= ki;
	}
	
	public int getKi() {
		return this.ki;
	}
	public void info() {
		System.out.println("id: " + id);
		System.out.println("age: " + age);
		System.out.println("muge: " + muge);
		System.out.println("ki: "+ ki);
		test();
	}
	
	private void test() {
		
	}
	
	
	
}

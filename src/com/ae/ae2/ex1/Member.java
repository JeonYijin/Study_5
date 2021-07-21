package com.ae.ae2.ex1;

public class Member {
	
	private String id; //멤버변수는 앞으로 private으로 지정하고 get, set메서드 사용
	private int age;
	private int muge;
	private int ki;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMuge() {
		return muge;
	}

	public void setMuge(int muge) {
		this.muge = muge;
	}

	public int getKi() {
		return ki;
	}

	public void setKi(int ki) {
		this.ki = ki;
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

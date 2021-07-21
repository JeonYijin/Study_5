package com.ae.ae1.ex2;

 class Member {
	
	public String id;
	
	//default는 생략
	int age;
	
	private String name;
	
	 private Member(){ //만약 private이면 
		this.id = "aespa";
		this.age = 22;
		this.name = "giselle";
	}
	 
	 public Member test() {
		 return new Member();  //--> 이렇게 해도 할수가 없음 멤버 메서드를 쓰려면 객체 생성 근데 객체가 private
	 }
	
}

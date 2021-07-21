package com.ae.ae2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.setAge(30);
		 int age = member.getAge();
		System.out.println(age);
		//member.info();
		
		member.setId("aespa");
		String id = member.getId();
		System.out.println(id);
		
		member.setMuge(50);
		int muge = member.getMuge();
		System.out.println(muge);
		
		member.setKi(175);
		int ki = member.getKi();
		System.out.println(ki);
	}

}

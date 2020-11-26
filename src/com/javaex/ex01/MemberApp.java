package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member jong = new Member();
		jong.setName("정우성");
		jong.setInitial("(jws)");
		jong.setPoint(50000);
		jong.showInfo();
		
		Member you = new Member();
		you.setName("유재석");
		you.setInitial("(yjs)");
		you.setPoint(30000);
		you.showInfo();
		
		Member lee = new Member();
		lee.setName("이효리");
		lee.setInitial("(lhr)");
		lee.setPoint(40000);
		lee.showInfo();
		
		
	}

}

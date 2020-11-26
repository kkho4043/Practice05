package com.javaex.ex01;

public class Member {
	private String name;
	private String initial;
	private int point;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInitial() {
		return initial;
	}
	public void setInitial(String initial) {
		this.initial = initial;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("회원정보: " + name +initial + ", " + point + "점" );
	}
	
}

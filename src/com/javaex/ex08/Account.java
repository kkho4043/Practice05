package com.javaex.ex08;

public class Account {
  
	private String accountNo;
	
    private int balance;
    
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(this.accountNo + "계좌가 계설되었습니다");
	}
	public void deposit(int money) {
		// TODO Auto-generated method stub
		this.balance += money;
	}
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		this.balance -= money;
	}
	public void showBalance() {
		// TODO Auto-generated method stub
		System.out.println(balance);
	}
    
    //생성자 작성
    
    //필요한 메소드 작성

}

package com.yedam.dongwoo;

public class BusineseMan extends Man {
	
	String company;
	BusineseMan(){}
	BusineseMan(String company){
		super(); //부모가 가지고있는 생성자를 쓰겠다?
		this.company = company;
	}
	BusineseMan(String name, String company){
		super(name);
		this.company = company;
	}
	public void tellYourInfo() {
		System.out.println("My company is "+ company);
	}
	@Override
	public void tellYourName() {
		super.tellYourName();
		System.out.println("My company "+ company);
	}
	
}

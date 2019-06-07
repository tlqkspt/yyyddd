package com.yedam.dongwoo;

public class UnivMan extends Man{
	String major;
	UnivMan(){}
	UnivMan(String major){
		this.major = major;
	}
	UnivMan(String name, String major){
		super(name);
		this.major = major;
	}
	public void tellYourUniv( ) {
		System.out.println("my major is "+ major);
	}
	@Override
	public void tellYourName() {
		super.tellYourName();
		System.out.println("My major is "+major);
	}
}

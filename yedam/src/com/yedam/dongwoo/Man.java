package com.yedam.dongwoo;

public class Man {
	//필드
	String name;
	//생성자
	Man(){}
	Man(String name){
		this.name = name;
	}
	//메소드
	public void tellYourName() {
		System.out.println("My name is " + name );
	}
}

package com.yedam.dongwoo;

public class Professor_M extends Man {
	String pNo;
	
	
	Professor_M(){}
	Professor_M(String name, String pNo){
		super(name);
		this.pNo = pNo;
	}
	
	public void tellYourName() {
		super.tellYourName();
		System.out.println("교수번호 :"+pNo);
	}
	
}

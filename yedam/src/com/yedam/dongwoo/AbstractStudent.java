package com.yedam.dongwoo;

public class AbstractStudent extends AbstractMan {
	String name;
	String sNo;
	
	AbstractStudent(String name, String sNo){
		this.name = name;
		this.sNo = sNo;
	}
	
	void getInfo() {
		System.out.println("name is "+ name + ", sNo is "+sNo);
		
	}
}

class AbstractProfessor extends AbstractMan{
	String name;
	String pNo;
	
	AbstractProfessor(String name, String pNo){
		this.name = name;
		this.pNo = pNo;
	}
	
	@Override
	void getInfo() {
		// TODO Auto-generated method stub
		
	}
	
}

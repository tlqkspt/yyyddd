package com.yedam.dongwoo;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractMan man1 = new AbstractStudent("student1","s1111");
		AbstractMan man2 = new AbstractProfessor("professor1","p1111");
		
		
		man1.getInfo();
		man2.getInfo();
		
	}

}

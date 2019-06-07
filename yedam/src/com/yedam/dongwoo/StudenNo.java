package com.yedam.dongwoo;

public class StudenNo {
	private String stno;
	private String name;
	private String major;
	
	StudenNo() {}
	StudenNo(String stno, String name, String major) {
		this.stno = stno;
		this.name = name;
		this.major = major;
	}
	
	String getstno() {
		return this.stno;
	}
	String getname() {
		return this.name;
	}
	String getmajor() {
		return this.major;
	}
	
	void setstno(String stno) {
		this.stno = stno;
	}
	void setname(String name) {
		this.name = name;
	}
	void setmajor(String major) {
		this.major = major;
	}
	
	
	
}

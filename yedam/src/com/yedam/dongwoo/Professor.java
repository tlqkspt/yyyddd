package com.yedam.dongwoo;

public class Professor {
	private String professorNo;
	private String name;
	private String major;
	
	Professor(){}
	
	Professor(String name){
		this.name = name;
	}
	Professor(String name, String major){	
		this.name = name;
		this.major = major;
	}
	
	Professor(String professrNo,String name, String major){	
		this.professorNo = professrNo;
		this.name = name;
		this.major = major;
	}
	
	String getprofessorNo() {
		return this.professorNo;
	}
	String getname() {
		return this.name;
	}
	String getmajor() {
		return this.major;
	}
	void setprofessorNo(String professorNo) {
		this.professorNo = professorNo;
	}
	void setname (String name) {
		this.name = name;
	}
	void setmajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Professor [professorNo=" + professorNo + ", name=" + name + ", major=" + major + "]";
	}
	
}

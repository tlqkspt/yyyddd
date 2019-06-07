package com.yedam.dongwoo;

class InterfaceStudent implements InterfaceMan {
	String name;
	String sNo;
	String phone;

	InterfaceStudent(){}
	InterfaceStudent(String name,String sNo, String phone){
		this.name = name;
		this.sNo = sNo;
		this.phone = phone;
	}
	public void getInfo() {
		System.out.println("name = " + name + "," + "phone = "+ phone+","+" sNo = " + sNo);
	}

	public String getName() {
		return name;
	}
}

class InterfaceProfessor implements InterfaceMan {
	String name;
	String pNo;
	String phone;

	InterfaceProfessor(String name,String pNo, String phone){
		this.name = name;
		this.pNo = pNo;
		this.phone = phone;
	}
	
	public void getInfo() {
		System.out.println("name = " + name + "," + "phone = "+ phone+","+" pNo = " + pNo);
	}

	public String getName() {
		return name;


	}
}

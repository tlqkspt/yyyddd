package com.yedam;

public class PersonExample {
	public static void main(String[] args) {
		Person person = new Person("11111111","홍길동");
		//person.ssn = "222222";
		person.name = "김길동";
		System.out.println(person.nation+","+person.name+","+person.ssn);
	}
}

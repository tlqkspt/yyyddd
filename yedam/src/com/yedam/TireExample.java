package com.yedam;

import com.yedam.hankook.SnowTire;
import com.yedam.kumho.WideTire;  //* 해당되는 패키지밑의 라이브러리만 가져옴

class Wheel{
	void wheelSize() {
		System.out.println("휠사이즈...");
	}
}

public class TireExample {
	public static void main(String[] args) {
		Wheel wheel = new Wheel();
		SnowTire snowTire = new SnowTire();
		
		snowTire.showType();
		WideTire wideTire = new WideTire();
		wideTire.showInfo();
		 com.yedam.hankook.Tire tire1 = new  com.yedam.hankook.Tire();
		 com.yedam.kumho.Tire tire2 = new  com.yedam.kumho.Tire();
		
	}
}

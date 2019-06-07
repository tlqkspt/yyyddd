package com.yedam.dongwoo;

public class Calculator {
	static double PI  = 3.14;
	String color;
	
	void setColor(String color) {
		this.color = color;
	}
	static double plus(double x, double y) {
		return x+y;
	}
	static double minus(double x, double y) {
		return x-y;
	}
	
	static void multi(int a) {}
	
	static double execute(double a, double b, String str) {
		double result = 0;
		
		if(str.equals("+")) {
			result = plus(a,b);
		}
		if(str.equals("-")) {
			result = minus(a,b);
		}
		return result;
	}
}

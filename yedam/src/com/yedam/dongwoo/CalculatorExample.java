package com.yedam.dongwoo;

public class CalculatorExample {
	public static void main(String[] args) {
		double result = Calculator.minus(30, 20);
		System.out.println("결과값은: " + result);

		result = Calculator.plus(100.2, 24.2);
		
		result = Calculator.execute(2.3,3.3,"+");
		
		System.out.println(result);
	}
}

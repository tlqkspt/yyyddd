package oracle.com;

import java.util.Scanner;

public class SaChik {
	public static void main(String[] args) { //숫자 두개 입력하면 +-/* 해주는 매서드 생성
		int  num1;
		int num2;
		int res=0;
		System.out.println("값 입력");			//값?값 ?자리에 기호 if?
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1:");
		num1 = sc.nextInt();
		
		
		System.out.println("숫자2:");
		num2 = sc.nextInt();
		
		System.out.println("+-*/");
		String s = sc.next();
		
		if(s.equals("+")) { plus(num1,num2); }
		if(s.equals("*")) { multi(num1,num2); }
		if(s.equals("-")) { subtract(num1,num2); }
		if(s.equals("/")) { divide(num1,num2); }
		
//		if(num1+num2 = res)
//		System.out.println(plus(num1,num2)); 
//		System.out.println(subtract(num1,num2)); 
//		System.out.println(divide(num1,num2)); 
//		System.out.println(multi(num1,num2)); 
			
	}

	static void plus(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	static void subtract(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	static void divide(int num1, int num2) {
		System.out.println(num1 / (double)num2);
	}
	static void multi(int num1, int num2) {
		System.out.println(num1 * num2);
}
}
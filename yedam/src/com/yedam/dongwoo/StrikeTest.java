package com.yedam.dongwoo;

import java.util.Scanner;

public class StrikeTest {
	public static void main(String[] args) {
		Strike os = new Strike();
		Scanner sc = new Scanner(System.in);
		
		os.ranmake(); // 랜덤공 만들고
		System.out.print(os.ranball[0]);
		System.out.print(os.ranball[1]);
		System.out.println(os.ranball[2]);
		do {
			for(int i=0;i<os.inputball.length;i++) { //공3개입력
			System.out.println((1+i)+"번공 입력:");
			os.setball(sc.nextInt(), i);
			}
			
			os.counter();
			
			os.gamenum();
			System.out.println(os.gamenum+"out");
			os.check();

		} while (os.check == false);

	}
}

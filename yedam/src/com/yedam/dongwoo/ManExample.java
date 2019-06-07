package com.yedam.dongwoo;

import java.util.Scanner;

public class ManExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		Man[] manAry = new Man[5];
		String name, major, company;

		while (true) {
			System.out.println("1:대학친구입력  2:거래처입력  3:조회");
			menu = sc.nextInt();
			if (!(menu <= 3 || menu > 0))
				continue;
			if (menu == 1) {
				System.out.println("대학친구 이름:");
				name = sc.next();
				System.out.println("대학친구 전공:");
				major = sc.next();
				for (int i = 0; i < manAry.length; i++) {
					if (manAry[i] == null) { 
						manAry[i] = new UnivMan(name, major);
						break;
					}
				
				}

				
			}
			if (menu == 2) {
				System.out.println("거래처 사원 이름:");
				name = sc.next();
				System.out.println("거래처 회사 이름:");
				company = sc.next();
				for (int i = 0; i < manAry.length; i++) {
					if (manAry[i] == null) { 
						manAry[i] = new BusineseMan(name, company);
						break;
					}
				
				}
			}
			if (menu == 3) {
				for (int i = 0; i < manAry.length; i++) {
					if(manAry[i] != null)
					manAry[i].tellYourName();
				}

			}

		}

	}
}

//		Man[] manAry = new Man[5];
//		manAry[0] = new BusineseMan();
//		manAry[1] = new UnivMan();
//		Man man1 = new BusineseMan("name1", "yedam");
//		Man man2 = new UnivMan("name2", "computer");
//
//		man1.tellYourName();
//		man2.tellYourName();

//BusineseMan bm = new BusineseMan();
//bm.name = "이창호";
//bm.company = "예담";
//bm.tellYourName();
//bm.tellYourInfo();
//
//BusineseMan bm1 = new BusineseMan("안녕");
//bm1.name = "fwrk";
//bm1.tellYourName();
//bm1.tellYourInfo();
//
//BusineseMan bm2 = new BusineseMan("안ㅇㅇ녕","예담");
//bm2.tellYourName();
//bm2.tellYourInfo();
//
//Man man1 = new BusineseMan();
//Man man2 = new UnivMan();
//man1.name = "man1";
//man2.name = "man2";
//man1.tellYourName();
//man2.tellYourName();
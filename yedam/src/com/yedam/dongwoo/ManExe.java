package com.yedam.dongwoo;

import java.util.Scanner;

public class ManExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Man[] mAry = new Man[5]; // 맨형태 배열
		int menu = 0; // 메뉴
		String name, No;

		while (menu != 4) {
			System.out.println("1)학생정보입력  2)교수정보입력  3)전체조회  4)종료.");
			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("학생이름 입력 : ");
				name = sc.next();
				System.out.println("학번입력 :");
				No = sc.next();

				Student std = new Student(name, No);
				info(std, mAry);
			}
			
			else if (menu == 2) {
				System.out.println("교수이름 입력 : ");
				name = sc.next();
				System.out.println("교수번호입력 :");
				No = sc.next();

				Professor_M pro = new Professor_M(name, No);
				info(pro, mAry);
			}

			else if (menu == 3) {
				show(mAry);

			}
			else
				System.out.println("end");
		}
	}

	static void info(Man m, Man[] mAry) {		//입력
		int counter = 0;
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] == null) {
				mAry[i] = m;
				System.out.println("입력됨");
				break;
				
			}
			else if(mAry[i] != null) {
				counter++;
				if (counter == 5) 
				System.out.println("@@@@@@@@@@@@@@@자리없음@@@@@@@@@@@@@@@@@");
			
			}
		}
		
	}

	static void show(Man[] mAry) {				//조회
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] == null)
				break;
			System.out.print(i+" "); mAry[i].tellYourName();
		}
	}
}

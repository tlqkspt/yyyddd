package com.yedam.dongwoo;

import java.util.Scanner;

public class InterfaceManExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		InterfaceMan[] iAry = new InterfaceMan[5];
		int menu = 0;
		String name, num, phone;

		while (true) {
			System.out.println("1)학생정보입력  2)교수정보입력  3)전체조회  4)종료.");
			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("학생이름 입력 : ");
				name = sc.next();
				System.out.println("폰번호 입력 : ");
				phone = sc.next();
				System.out.println("학번입력 :");
				num = sc.next();

				InterfaceStudent sd = new InterfaceStudent(name, num, phone);
				setInfo(sd, iAry);
			}
			if (menu == 2) {
				System.out.println("교수이름 입력 : ");
				name = sc.next();
				System.out.println("폰번호 입력 : ");
				phone = sc.next();
				System.out.println("교수번호입력 :");
				num = sc.next();

				InterfaceProfessor pro = new InterfaceProfessor(name, num, phone);
				setInfo(pro, iAry);
			}
			if (menu == 3) {

				for (int i = 0; i < iAry.length; i++) {
					if (iAry != null) {
						iAry[i].getInfo();
						System.out.println(iAry[i].getName());
					}
				}
			}
			if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	static void setInfo(InterfaceMan man, InterfaceMan[] iAry) {
		for (int i = 0; i < iAry.length; i++) {
			if (iAry[i] == null) {
				iAry[i] = man;
				break;
			}
		}
	}
}

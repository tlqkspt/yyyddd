package com.yedam;

import java.util.Scanner;

public class BankApplication {

	private static Bank_Account[] bAAry = new Bank_Account[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu = 0;

		while (true) {
			System.out.println("1)계좌생성 2)계좌목록 3)입금 4)출금 5)종료");
			menu = sc.nextInt();

			if (menu == 1) {
				accountCreate(); // 계좌생성
			}
			if (menu == 2) {
				accountList(); // 계좌목록
			}
			if (menu == 3) {
				deposit(); // 입금
			}
			if (menu == 4) {
				withdraw(); // 출금
			}
			if (menu == 5) {
				System.out.println("종료");
				break;
			}
		}
	}

	// 계좌 생성

	private static void accountCreate() {

		String ano, owner;
		int balance;

		System.out.println("계좌번호: ");
		ano = sc.next();
		System.out.println("계좌 주인: ");
		owner = sc.next();
		System.out.println("금액 :");
		balance = sc.nextInt();

		for (int i = 0; i < bAAry.length; i++) {
			if (bAAry[i] == null) {
				bAAry[i] = new Bank_Account(ano, owner, balance);
				System.out.println("입력성공");
				break;
			}
		}
	}

	// 계좌 목록

	private static void accountList() {

		for (int i = 0; i < bAAry.length; i++) {
			if (bAAry[i] != null)
				System.out.println("계좌번호: "+bAAry[i].getAno() + ", 계좌명: " + bAAry[i].getOwner() + ", 잔고: " + bAAry[i].getBalance());
		}
	}

	// 입금 입금계좌 입력후 입력한 계좌와 같은 bAAry 에 balance 증가
	private static void deposit() {

		System.out.println("입금할 계좌 번호: ");
		String ano = sc.next();
		boolean success = false;
		for (int i = 0; i < bAAry.length; i++) {
			if (bAAry[i] != null) {
				if ((bAAry[i].getAno()).equals(ano)) {
					System.out.println("예금 금액: ");
					int pMoney = sc.nextInt();

					int balance = bAAry[i].getBalance();
					balance += pMoney;
					bAAry[i].setBalance(balance);

					System.out.println("예금성공");
					success = true;
				}
			}
		}
		if (success == false) {
			System.out.println("예금 실패");
		}
	}

	// 출금
	private static void withdraw() {
		System.out.println("출금할 계좌 번호: ");
		String ano = sc.next();
		boolean success = false;
		for (int i = 0; i < bAAry.length; i++) {
			if (bAAry[i] != null) {
				if ((bAAry[i].getAno()).equals(ano)) {
					System.out.println("출금 금액: ");
					int nMoney = sc.nextInt();
					int balance = bAAry[i].getBalance();

					if (nMoney <= balance) {
						balance -= nMoney;
						bAAry[i].setBalance(balance);

						System.out.println("출금성공");
						success = true;
					} else
						System.out.println("계좌에 출금할 잔액이 부족합니다");
				}
			}
		}
		if (success == false) {
			System.out.println("출금 실패");
		}
	}

}

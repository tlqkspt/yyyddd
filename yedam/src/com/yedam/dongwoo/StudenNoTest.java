package com.yedam.dongwoo;

import java.util.Scanner;

public class StudenNoTest {
	public static void main(String[] args) {

		Professor pf1 = new Professor();  //instance생성.
		pf1.setprofessorNo("1111");
		pf1.setname("김박사");
		pf1.setmajor("english");
		//System.out.println(pf1);
		//생성자..
		Professor pf2 = new Professor("2222","이박사","computer");
		//System.out.println(pf2);
		Professor[] prfAry = new Professor[3];////{pf1,pf2};
		Professor pf3 = new Professor("3333","최박사","math");
		prfAry[0] = pf1;
		prfAry[1] = pf2;
		//prfary[2] = null;
		prfAry[2] = pf2;
		
		pf2 = prfAry[0];
		
		System.out.println(prfAry[2]+"    1");
		
		prfAry[2] = new Professor("1234","박박사","사장");
		
		for(int i =0;i<prfAry.length;i++) {
			System.out.println(prfAry[i]);
		}
		
		System.out.println(pf2+"       3");
//===================================================================		

//		String name1;
//		String major1;
//		StudenNo sn = new StudenNo("12412", "나낳ㅎ", "과학");
//
//		StudenNo[] sarr = new StudenNo[5];
//
//		for (int i = 0; i < sarr.length; i++) { ///// 클래스배열 초기화 안하면 값을 못넣나?
//			sarr[i] = new StudenNo();
//		}
//		while(true) {
//		System.out.println("입력 1번");
//		System.out.println("조회 2번");
//		System.out.println("종료 0번 :");
//		Scanner sc = new Scanner(System.in);
//
//		int num1 = sc.nextInt();
//		
//		if (num1 == 1) {
//			System.out.println("몇번에 데이터 입력? 0~"+(sarr.length-1));
//			int dnum = sc.nextInt();
//			// if(sarr[i].getstno == null) ////칸이 비었는지 검사
//			
//			System.out.println("학번 입력: ");
//			sarr[dnum].setstno(sc.next());
//
//			System.out.println("이름 입력: ");
//			sarr[dnum].setname(sc.next());
//
//			System.out.println("전공 입력: ");
//			sarr[dnum].setmajor(sc.next());
//		}
//		if (num1 == 2) {
//			for (int i = 0; i < sarr.length; i++) { // 1.출력  2.출력문 칸이 비었으면 출력안하도록
//				System.out.print(i+"번 데이터:"+sarr[i].getstno()+"       ");
//				System.out.print(sarr[i].getname()+"       ");
//				System.out.println(sarr[i].getmajor());
//			}
//
////			System.out.println(sarr[1].getstno());
////			System.out.println(sarr[1].getname());
////			System.out.println(sarr[1].getmajor());
////
////			System.out.println();
//		}
//		if(num1 == 0) {
//			System.out.println("END");
//			break;
//		}
//		
//		}
	}
}

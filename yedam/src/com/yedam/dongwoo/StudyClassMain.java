package com.yedam.dongwoo;

import java.util.Scanner;

public class StudyClassMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.반정보생성
		// 1.
//		Professor professor = new Professor("p1111","pname1","english");
//		Student student1 = new Student("s1111", "sname1", "english");
//		Student student2 = new Student("s2222", "sname2", "english");
//		Student student3 = new Student("s3333", "sname3", "english");
//		Student[] studentAry = {student1, student2, student3};
//		sclass.setClassName("English");
//		sclass.setProfessor(professor);
//		sclass.setStudentAry(studentAry);
//		//System.out.println(sclass);
//		System.out.println(sclass.classInfo());

		StudyClass[] sclass = new StudyClass[2];
		String cName, name, pNum, pMajor, stdc;
		int sNum = 0;
		int menu = 0; // 주메뉴
		int menu2 = 0; // 하위메뉴

		while (true) {
			System.out.println("1)반 정보생성  2)반 정보조회");
			menu = sc.nextInt();

			if (menu == 1) { // 반 정보생성 / 교수정보 or 학생정보 입력
				System.out.println("1)반 정보  2)학생 정보입력 ");
				menu2 = sc.nextInt();
				if (menu2 == 1) { /// 1 반정보

					System.out.println("반이름: ");
					cName = sc.next();

					System.out.println("담임 이름: ");
					name = sc.next();

					System.out.println("학생수: ");

					sNum = sc.nextInt();

					Professor pf = new Professor(name);

					Student[] stAry = new Student[sNum]; // 입력값을 스터디클래스로 던져줌

					for (int i = 0; i < sclass.length; i++) { //
						if (sclass[i] == null) {
							sclass[i] = new StudyClass(cName, pf, stAry);
							break;
						}
					}
				}
				if (menu2 == 2) { /// 1 반정보

					System.out.println("학생 이름: ");
					name = sc.next();

					Student std = new Student();
					std.setName(name);

					for (int i = 0; i < sclass.length; i++) { // 현재 반 현황.
						System.out.print(sclass[i].className + " /");
					}
					System.out.println();

					System.out.println("학생 반 :");
					stdc = sc.next();

					for (int i = 0; i < sclass.length; i++) {
						if (sclass[i].className.equals(stdc)) { // 학생 반 입력 정보가 StudyClass 의 className 과 같으면
							insertStudent(sclass[i], std); // StudyClass 의 studentAry 에 추가
							System.out.println("학생 반 입력됨.");
							break;
						}
					}
				}

			}

			if (menu == 2) {
				System.out.println("1)모두 조회 2) 반 선택조회");
				menu2 = sc.nextInt();
				
				if (menu2 == 1) {
					System.out.println("왜안나와");
					for (int i = 0; i < sclass.length; i++) {
						if (sclass[i] != null)
							System.out.println(sclass[i].toString());
					}

				}
			}
		}
	}

	static void setInfoP(StudyClass p, StudyClass[] aryClass) {

		for (int i = 0; i < aryClass.length; i++) {
			if (aryClass[i] == null) {
				aryClass[i] = p;
				break;
			}
		}
	}

	static void insertStudent(StudyClass a, Student st) { // 학생입력
		a.setStudentInfo(st);
	}
}
package com.yedam.dongwoo.ectendPkg;

public class DDD {
	public static void main(String[] args) {
		int num = 1;
		int[][] ary = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				ary[i][j] = num++;
			}
		}
		for (int i = 4; i >=0; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d",ary[j][i]);
			}
		System.out.println();
		}System.out.println();
		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >=0; j--) {
				System.out.printf("%2d",ary[i][j]);
			}
		System.out.println();
		}
	}
}

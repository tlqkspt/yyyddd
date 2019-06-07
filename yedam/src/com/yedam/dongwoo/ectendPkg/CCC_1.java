package com.yedam.dongwoo.ectendPkg;

public class CCC_1 {
	public static void main(String[] args) {
		int[][] ary = new int[3][4];
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				ary[i][j] = num*2;
				num++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%2d ", ary[i][j]);
			}
			System.out.println();
		}
	}
}

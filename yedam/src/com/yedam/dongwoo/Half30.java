package com.yedam.dongwoo;

public class Half30 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - i; j++) {
				arr[j][i] = num++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[j][i] != 0)
					System.out.printf("%2d ",arr[j][i]);
			}
			System.out.println();
		}

	}
}
//		int[][] arr = new int[5][5];
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[j][i] = (1 + j) + (i * 5);
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[j][i] + "  ");
//			}
//			System.out.println();
//		}
//		

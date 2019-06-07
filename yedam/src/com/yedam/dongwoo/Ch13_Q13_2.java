package com.yedam.dongwoo;

public class Ch13_Q13_2 {
	public static void main(String[] args) {
		int[][] arr = {
						{ 1, 2, 3 },
						{ 4, 5, 6 },
						{ 7, 8, 9 }
									};
		Ch13_Q13_2 a = new Ch13_Q13_2();
		a.hengp1(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

	 void hengp1(int arr[][]) {
		 int[] temp = new int[arr[arr.length-1].length];
		 
		 for(int i =0; i<temp.length; i++)    //마지막렬 다른곳에보관
			 temp[i] = arr[arr.length-1][i];
		 
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length ; j++) {
				
				if (i+1 == arr.length)
					arr[arr.length-1][j] = temp[j];

				else arr[i+1][j] = arr[i][j];
			}
		}
	}
}

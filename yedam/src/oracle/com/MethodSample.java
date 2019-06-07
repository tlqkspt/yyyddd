//package oracle.com;
//
//public class MethodSample {
//	
//	public static void main(String[] args) {
//		int res = multi(3,5);
//		println(res);
//	}
//	public static int multi(int a, int b) {//두수의 곱을 계산하는 메소드
//		return a*b;
//	}
//	public static void println(int c) {//입력받은 String 변수를 화면에 보여주는 프로그램
//		System.out.print(c);
//	}
//}
package oracle.com;

import java.util.Scanner;

public class MethodSample {
	
	public static void main(String[] args) {
		int res = 0;
		absMinus(1,2);
		Scanner sc = new Scanner(System.in);
		System.out.println("input int value:");
		int num1 = sc.nextInt();
		System.out.println("input int value:");
		int num2 = sc.nextInt();
		System.out.println("결과값은"+result+"입니다.");
		
		System.out.println(absMinus(1,2));
		System.out.println(divide(4,6));
	}
	public static int absMinus(int a, int b) {  //절대치비교
		if(a<b) return b-a;
		else return a-b;
	}
	public static double divide(int a, int b) { // 나누기 이상한값들어오면 안된다고
		if(a==0||b==0) return 000000000000;
		return a/(double)b;
	}
}
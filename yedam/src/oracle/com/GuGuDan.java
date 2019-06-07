package oracle.com;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단 출력?");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
		
		gugu(1,4,5);
	}
	
	public static void gugu(int num1) {
		
		for(int i=1; i<10; i++)
			System.out.println(num1+"*"+i+"="+(num1*i));
	}
	static void gugu(int num1, int num2) {
		
		for(int i=1; i<10; i++) {
			System.out.print(num1+"*"+i+"="+(num1*i)+"    ");
		
			System.out.println(num2+"*"+i+"="+(num2*i));
	
		}
	}
	static void gugu(int num1,int num2,int num3) {
		gugu(num1);gugu(num2);gugu(num3);
	}
}

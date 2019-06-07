package oracle.com;

public class MethodDef {
	public static void main(String[] args) {
		System.out.println("프로그램시작.");
		hiEveryOne(11);
		hiEveryOne(21,167);
		goodBye();
		double avg =avgScore(4,5);
		System.out.println("score:"+avg);
		System.out.println("프로그램종료");
		
	}
	
	public static double avgScore(int a, int b) {
		return (a+b)/(double)2;
	}
	
	public static int sumScore(int m, int e, int k) {
		return m+e+k;
	}
	public static  void hiEveryOne(int age) {
		System.out.println("hello, everyone");
		System.out.println("I am"+ age +" old. ");
	}
	public static  void hiEveryOne(int age,double height) {
		System.out.println("hello, everyone");
		System.out.println("I am"+ age +" old. ");
		System.out.println("I am"+height+"cm.");
	}
	public static void goodBye() {
		System.out.println("bye");
	}
}

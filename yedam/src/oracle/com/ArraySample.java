package oracle.com;

class Friend{
	String name;
	String phone;
	int age;
	Friend(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getPhone() {
		return phone;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
}

public class ArraySample {

	public static void main(String[] args) {
		
		Friend fr1 = new Friend("홍길동");
		Friend fr2 = new Friend("김길동");
		Friend fr3 = new Friend("이길동");
		fr1.setPhone("1111");
		fr2.setPhone("2222");
		fr3.setPhone("3333");
		fr1.setAge(44);
		fr2.setAge(22);
		fr3.setAge(14);
		
		Friend[] frndAry = {fr1,fr2,fr3};
		for(int i=0; i<frndAry.length;i++) {
			System.out.println(frndAry[i].getName()+"+"+frndAry[i].getPhone()+"--"+frndAry[i].getAge());
		}
		
		
		
		
		
//		
//		int[] ary = { 5, 7, 3 };
//		int[] arry = new int[5];
//		System.out.println("arry의 배열 크기:" + arry.length);
//		for (int i = 0; i < arry.length; i++) {
//			System.out.println(arry[i]);
//		}
//		for (int i = 0; i < arry.length; i++) {
//			arry[i] = (i + 1) * 10;
//		}
//		for (int i = 0; i < arry.length; i++) {
//			System.out.println(arry[i]);
//		}
//
//		int num = 0;
//		while (num < arry.length) {
//			arry[num] = (num + 1) * 100;
//			num++;
//		}
//		for (int h = 0; h < arry.length; h++) {
//			System.out.println(arry[h]);
//		}
//
//		int sum = 0;
//		for (int i = 0; i < arry.length; i++) {
//			sum += arry[i];
//		}
//
//		System.out.println(sum);
//		int result = sum(ary);
//		System.out.println("result="+result);
//	}
//
//	static int sum(int[] ary) {
//		int sum =0;
//		for (int i = 0; i < ary.length; i++) {
//			sum += ary[i];			
//		}
//		return sum;
	}
}

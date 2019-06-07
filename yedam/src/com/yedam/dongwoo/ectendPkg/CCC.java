package com.yedam.dongwoo.ectendPkg;

import com.yedam.dongwoo.AAA;

public class CCC {
	public static void main(String[] args) {
		AAA a = new AAA();    // import 안하면 com.yedam.dongwoo.AAA a = new com.yedam.dongwoo.AAA(); 이런식으로 써야함
		String str = new String("test12345");
		System.out.println((str.substring(1)));
		System.out.println((str.length()));
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println("str1.equals(str3)  "+str1.equals(str3));
		
		
		str1 = "hello1";
		str2 = "hello2";
		System.out.println(str1.compareTo(str2));   //-1 오름차순  , +1 내림차순
		
		System.out.println(str1.concat(str3));
		
	}
}

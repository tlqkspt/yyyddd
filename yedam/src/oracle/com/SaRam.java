package oracle.com;

public class SaRam {

	String name;
	int age;
	double height;
	double weight;

	SaRam() {
		name = "김씨";
		age = 30;
		height = 178.2;
		weight = 77.3;
	}

	SaRam(String n, int a, double hei, double wei) {
		name = n;
		age = a;
		height = hei;
		weight = wei;
	}

	void who(String w) {
		name = w;
	}

	void walk() {
		System.out.println(name+"걷기");
	}

	void run() {
		System.out.println(name+"뛰기");
	}

	void eat() {
		System.out.println(name+"밥먹기");
	}

}

package oracle.com;

public class Rectangle {
	double height;
	double width;
	
	Rectangle(){}
	
	Rectangle(double a, double b){
		height =a;
		width =b;
	}
	
	void getArea() {
		System.out.println("넓이는 12cm 입니다");
	}
	
	double getArea(double a) {
		return a*a;
	}
	
	double getArea(double a,double b) {
		return a*b;
	}
}


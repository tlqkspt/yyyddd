package oracle.com;

public class SamGak {
	 double width;
	 double height;
	 String  er = "안돼";
	 
	SamGak(){ 
		width =3;
		height =3;
		}
	SamGak(double a,double b,double c){
			System.out.println(er);
	}
	void SamGak() { System.out.println("dddddddddddd");}  
	//클래스와 이름같고 반환타입 있으면 매서드
	
	
	double getArea() {
		return width * height * 1/2;
	}
	static double getArea(double a, double b) {
		return a*b*1/2;
	}
	double getArea(double a) {
		return a*a*1/2;
	}
	
}	

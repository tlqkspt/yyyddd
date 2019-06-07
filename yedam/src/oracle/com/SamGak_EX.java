package oracle.com;

public class SamGak_EX {
	public static void main(String[] args) {
		double w,h,w1,h1;
		
		w=4;
		h=7;
		w1=3;
		h1=5;
		
		SamGak sg = new SamGak();
		SamGak sg2 = new SamGak(1,2,3);
		
		sg.SamGak();
		
		System.out.println(sg.getArea());
	
		System.out.println(sg.getArea(2));
		
		System.out.println(sg.getArea(3,4));
		
//		System.out.println(sg2.getArea());
//		
//		System.out.println(sg2.getArea(w1));
//		
//		System.out.println(sg2.getArea(w1, h1));
//		
	}
}

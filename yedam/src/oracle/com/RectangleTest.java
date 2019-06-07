package oracle.com;

public class RectangleTest {
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Rectangle rec2 = new Rectangle(3,2);
		
		System.out.println(rec2.height+","+rec2.width);
		System.out.println(rec.getArea(4));
		System.out.println(rec.getArea(5,6));
		
	}

}

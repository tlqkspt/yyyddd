package oracle.com;


public class Q06_1 {

	static class San{
		public void sum(int n1 , int n2) { System.out.println("n1+ n2="+n1+n2);;}
		public float div(int n1 , int n2) { return (float)n1/n2;}

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		San s;
		s = new San();
		
		num1 =1;
		num2 =2;
		
		s.sum(num1,num2);
		System.out.println(s.div(num1,num2));
	}

}

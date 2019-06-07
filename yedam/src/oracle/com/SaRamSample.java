package oracle.com;

public class SaRamSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaRam person;
		person = new SaRam();
	    SaRam person1= new SaRam("박씨",88,170.2,54.22);
		
		
		person.who("최씨");
		
		
		System.out.println("이름:"+person.name);
		System.out.println("나이:"+person.age);
		System.out.println("키:"+person.height);
		System.out.println("몸무게:"+person.weight);
		person.walk();
		System.out.println();
		
		System.out.println("이름:"+person1.name);
		System.out.println("나이:"+person1.age);
		System.out.println("키:"+person1.height);
		System.out.println("몸무게:"+person1.weight);
		person1.walk();
		
		System.out.println();
		person.walk();
		person.run();
		person.eat();
		
	}

}

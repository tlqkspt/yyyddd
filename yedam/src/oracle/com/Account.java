package oracle.com;

public class Account {
	//필드
	private int balance;
	private String acNumber; // 계좌 234-564-873
	private String ssNumber; // 주민 "student"
	
	//생성자
	Account(){}
	Account(String ac, String ss){
		acNumber =ac;
		ssNumber =ss;
	}
	
	void initAccount(int amt) {
		balance = amt;
	}
	// 메소드
	void withdraw(int amt) { // 인출
		balance = balance - amt;
	}
	void input(int amt) { // 입금
		balance = balance + amt;
	}
	void checkBalance() { // 잔액조회
		System.out.println("계좌번호는:"+ acNumber);
		System.out.println("주민번호:"+ ssNumber);
		System.out.println("잔액은: " + balance);
	}
}
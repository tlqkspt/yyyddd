package oracle.com;

public class AccountSample {
	public static void main(String[] args) {
		int number1 =0;
		Account acct = new Account("11111=11111","1244414-1232145");
//		acct.balance = 10000;
//		acct.initAccount(10000);
//		acct.checkBalance();
//		acct.input(5000);
//		acct.checkBalance();
//		acct.acNumber = "1234-5678";
//		acct.ssNumber = "800101-123456789";
		acct.checkBalance();
		Account acct2 = new Account();
		acct2.checkBalance();
		
		System.out.println();
		check(acct);
		System.out.println();
		check(acct2);
	}
	static void addNum(int a, double b) {
		
	}
	static void check(Account act) {
		act.checkBalance();
	}
}


//private 생성자나 매서드 통해서 접근가능
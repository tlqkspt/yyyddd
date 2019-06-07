package oracle.com;

class BankAccount1 {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount ;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액:"+balance);
		return balance;
	}
}
public class DupRef {
	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1; // ref1 이 참조하는 대상을 red2도 참조
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
	}

}

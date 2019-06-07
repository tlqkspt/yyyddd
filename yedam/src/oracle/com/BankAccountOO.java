package oracle.com;

class BankAccount{
	int balance=0;  //예금잔액
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : "+ balance);
		return balance;
	}
}


class BankAccountOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인스턴스 두개생성
		BankAccount yoon = new BankAccount();
		BankAccount park;
		park = new BankAccount();
		
		//각 인스턴스를 대상으로 예금을 진행
		yoon.deposit(5000);
		park.deposit(3000);
		
		//각 인스턴스대상 출금
		yoon.withdraw(2000);
		park.withdraw(2000);

		//각 인스턴스 대상 잔액 조회
		yoon.checkMyBalance();
		park.checkMyBalance();
		
	}

}

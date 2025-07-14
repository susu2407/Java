package sub1;

public class Account {
	
	// 속성
	public String bank; 	//은행명
	public String id;		//계좌번호
	public String name;		//입금주
	public int balance;		//현재잔액
	
	// 기능
	public void deposit(int money) {		
		this.balance += money;
	}
	
	public void withdraw(int money) {		
		this.balance -= money;	
	}
	
	public void show() {
		System.out.println("---------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("---------------------");		
	}

}

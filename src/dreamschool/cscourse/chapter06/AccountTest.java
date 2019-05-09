package dreamschool.cscourse.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.accName = "홍길동" ; 
		acc.accNo = "123-456789" ;
		acc.balance = 10000 ;
		
		acc.printAccountInfo();
		
		System.out.println("잔액 : " + acc.balance + "원");
		
		System.out.println("20000원을 입금합니다.");
		acc.deposit(20000);
		
		System.out.println("잔액 : " + acc.balance + "원");
		
		System.out.println("-30000원을 출금합니다.");
		acc.withdraw(-30000) ;
		System.out.println("잔액 : " + acc.balance + "원");
	

	}

}

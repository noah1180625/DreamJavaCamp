package dreamschool.cscourse.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.accName = "ȫ�浿" ; 
		acc.accNo = "123-456789" ;
		acc.balance = 10000 ;
		
		acc.printAccountInfo();
		
		System.out.println("�ܾ� : " + acc.balance + "��");
		
		System.out.println("20000���� �Ա��մϴ�.");
		acc.deposit(20000);
		
		System.out.println("�ܾ� : " + acc.balance + "��");
		
		System.out.println("-30000���� ����մϴ�.");
		acc.withdraw(-30000) ;
		System.out.println("�ܾ� : " + acc.balance + "��");
	

	}

}

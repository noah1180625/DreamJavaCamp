package dreamschool.cscourse.chapter09;

public class AccountTest  {

	public static void main(String[] args) {
		FundAccount fund = new FundAccount("111-2222" , "ȫ�浿" , 5000000 , 4.7) ;
		FundAccount fund2 = new FundAccount("666-7777" , "ȫ���" , 1000000 , 2.9);
		
		fund.openAccount();
		System.out.println("������ �߻��߽��ϴ�.");
		
		System.out.println();
		fund2.openAccount();
		System.out.println("������ �߻��߽��ϴ�.");
		
		

	}

}


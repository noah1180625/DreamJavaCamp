package dreamschool.cscourse.chapter09;

public class AccountTest  {

	public static void main(String[] args) {
		FundAccount fund = new FundAccount("111-2222" , "홍길동" , 5000000 , 4.7) ;
		FundAccount fund2 = new FundAccount("666-7777" , "홍길순" , 1000000 , 2.9);
		
		fund.openAccount();
		System.out.println("수익이 발생했습니다.");
		
		System.out.println();
		fund2.openAccount();
		System.out.println("수익이 발생했습니다.");
		
		

	}

}


package dreamschool.cscourse.chapter08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		Account[] arrAcc = {new Account ("111 - 2222 - 5551" , 10000 , 4.5) ,
				            new Account ("111 - 2222 - 5552" , 20000 , 4.5) ,
				            new Account ("111 - 2222 - 5553" , 30000 , 4.5) ,
				            new Account ("111 - 2222 - 5554" , 40000 , 4.5) ,
				            new Account ("111 - 2222 - 5555" , 50000 , 4.5) 
				
		};
		for(int i = 0 ; i < arrAcc.length ; i++) {
			System.out.println("���¹�ȣ : " + arrAcc[i].getNum() + " / �ܾ� : " +
		           arrAcc[i].getBalance() + " / ���� : " + arrAcc[i].getInterestRate() + "%");
		}
		
		System.out.println();
		System.out.println("������ �����մϴ�");
		System.out.println();
		
		for(int i = 0 ; i < arrAcc.length ; i++ ) {
			arrAcc[i].setInterestRate(3.7);
			arrAcc[i].calculateInterest();
			System.out.println("���¹�ȣ : " + arrAcc[i].getNum() + " / ���� : " +
			           arrAcc[i].getInterestRate() + " % / �ܾ� : " + arrAcc[i].getBalance());
			
		}

	}

}

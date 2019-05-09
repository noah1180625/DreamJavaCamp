package dreamschool.cscourse.chapter05;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 26;
		
		for(int i = 2; i < number ; i++) {
			if(number % i == 0) {
				System.out.println("소수가 아닙니다");
			    break;
		}else {
				System.out.println("소수입니다.");
				break;
			}
	}
	}
}


package dreamschool.cscourse.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num1 = 456;
		int num2 = 100;
		int num3 = 10;
		
		
		System.out.println("숫자 : " + num1);
		System.out.println("백의 자리 수 : " + num1 / num2);
		System.out.println("십의 자리 수 : " + (num1 % num2) / num3 );
		System.out.println("일의 자리 수 : " + num1 % num3);
		

	}

}

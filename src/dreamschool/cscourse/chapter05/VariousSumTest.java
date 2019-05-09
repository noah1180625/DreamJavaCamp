package dreamschool.cscourse.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int evenSum = 0; //짝수의 합
		int oddSum = 0; //홀수의 합
		
		for(int i = 1 ; i <= 1000; i++) {
			sum+= i; 
			if( i % 2 == 0) {
				evenSum += i;	
			}else {
				oddSum += i;
			}
		}	
		
		System.out.println("1부터 1000까지의 합 : " + sum);
		System.out.println("1부터 100까지의 짝수들의 합 : " + evenSum);
		System.out.println("1부터 1000까지의 홀수들의 합 : " + oddSum);

	

	
}
}
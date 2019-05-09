package dreamschool.cscourse.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int[] nums = { 12, 53, 24, 10, 22, 38, 64, 39};
		int oddSum = 0 ;
		int evenSum = 0 ;
		for(int i = 0; i < nums.length ; i++) {
			if(i % 2 == 0 ) {
				evenSum += nums[i] ;
			
			}else {
				oddSum += nums[i];
			}
			
		}
		System.out.println("홀수 번째 정수의 합 : " + evenSum);
		System.out.println("짝수 번째 정수의 합  : " + oddSum);

	}

}

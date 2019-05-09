package dreamschool.cscourse.chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int[] nums = { 12, 53, 24, 10, 22, 38, 64, 39};
		
		int max = nums[0];
		int min = nums[0];
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값  : " + min);

	}

}

package dreamschool.cscourse.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySalary = 1000000;
		int totalAnnualSalary = monthlySalary * 12 ; 
		int annualSalaryAfterTax = totalAnnualSalary - (totalAnnualSalary / 100 * 10) ;
	    int bonus = (monthlySalary / 10) * 20 ; 
	    int annualBonus = bonus * 4 ;
		int bonusAfterTax = annualBonus - (annualBonus / 1000 * 55) ;
		int totalIncome = annualSalaryAfterTax + bonusAfterTax ;
		
		
		System.out.println("���� : " + monthlySalary + ", ���� ���� : " + annualSalaryAfterTax);
		System.out.println("���ʽ� : " + annualBonus + ", ���� ���ʽ� : " + bonusAfterTax) ;
	    System.out.println("���޾� : " + totalIncome);
		
		
		

	}

}

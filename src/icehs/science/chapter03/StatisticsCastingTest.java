package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lottoProbability = 0.0000001235;
		long population = 6973738433L;
	
		int intlottoProbability =(int)lottoProbability;
		System.out.println("�ζǿ� ��÷�� Ȯ�� :"+lottoProbability);
	    System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ :"+intlottoProbability);
	    
	    int intPopulation =(int)population;
	    System.out.println("�� ������ �α� �� :"+population);
	    System.out.println("�� ������ �α� �� int ��ȯ :"+intPopulation);

	}

}

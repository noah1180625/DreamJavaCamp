package dreamschool.cscourse.chapter06;

public class Car {
	String carName; 
	int oilAmount ; 
	double distance ; 
	
    void addOil(int amount) {
		oilAmount += amount ; // oilAmount = amount + oillAmount
	    System.out.println("�ֹ�����" + amount + "L �����մϴ�.") ;
	}
	
	void printCarInfo () {
		System.out.println("[" + carName + "] ���� �⸧�� : " + oilAmount + 
				"L, ������Ÿ� : " + distance + "km");

	}
	void driveCar(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + "����" + endPoint + "����"+ driveDistance + "km �����Ͽ����ϴ�.");
		distance += driveDistance ; // distance = driveDistance + distance
		oilAmount -= (int)(driveDistance / 20) ;
	}
	
	void distanceCheck() {
		System.out.println("���డ�� �Ÿ��� ��" + oilAmount * 20 + "km �Դϴ�" );
	}

}

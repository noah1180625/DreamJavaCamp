package dreamschool.cscourse.chapter06;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car () ;
		myCar.carName = "Dream School Car~~" ;
		myCar.oilAmount = 5;
		
		myCar.distance = 140 ;
		
		myCar.printCarInfo();
		
		myCar.addOil (10) ;
		
		myCar.printCarInfo();
		
		myCar.driveCar("IT����", "��õ���� " , 10.17);
		
	    myCar.printCarInfo();
	    
	    myCar.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
	    
	    myCar.printCarInfo();
	    
	    myCar.distanceCheck();
	    

	    
		
		
				

	}

}

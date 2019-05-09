package dreamschool.cscourse.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee ame = new Coffee() ;
		ame.name = "아메리카노" ;
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		Coffee latte = new Coffee() ; 
		latte.name = "카페라떼" ;
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee maki = new Coffee() ;
		maki.name = "마끼아또" ; 
		maki.price = 4500 ;
		maki.printCoffeeInfo();
		
		System.out.println( "총 금액 : " + (ame.price + latte.price + maki.price) + "원" ) ;
		

	}

}

package dreamschool.cscourse.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee ame = new Coffee() ;
		ame.name = "�Ƹ޸�ī��" ;
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		Coffee latte = new Coffee() ; 
		latte.name = "ī���" ;
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee maki = new Coffee() ;
		maki.name = "�����ƶ�" ; 
		maki.price = 4500 ;
		maki.printCoffeeInfo();
		
		System.out.println( "�� �ݾ� : " + (ame.price + latte.price + maki.price) + "��" ) ;
		

	}

}

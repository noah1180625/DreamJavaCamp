package dreamschool.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate choco = new Chocolate() ;
		choco.name = "아마도라" ; 
		choco.type = "다크" ; 
		choco.price = 2200 ; 
		
		choco.printChocolateInfo();
		System.out.println("아마도라 초콜렛 20개 : " + choco.calculateTotalPrice(20));
		choco.changeChocolateInfo("카페기리쉬", 2500);
		choco.printChocolateInfo();
		System.out.println("카페기리쉬 초콜렛 15개 (10% 할인) : " + choco.calculateTotalPrice(15, 10));
		choco.changeChocolateInfo("트리플 블랑", "화이트", 2300);
		
		
	
	}
	

}

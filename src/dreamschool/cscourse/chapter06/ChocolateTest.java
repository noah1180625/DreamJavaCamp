package dreamschool.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate choco = new Chocolate() ;
		choco.name = "�Ƹ�����" ; 
		choco.type = "��ũ" ; 
		choco.price = 2200 ; 
		
		choco.printChocolateInfo();
		System.out.println("�Ƹ����� ���ݷ� 20�� : " + choco.calculateTotalPrice(20));
		choco.changeChocolateInfo("ī��⸮��", 2500);
		choco.printChocolateInfo();
		System.out.println("ī��⸮�� ���ݷ� 15�� (10% ����) : " + choco.calculateTotalPrice(15, 10));
		choco.changeChocolateInfo("Ʈ���� ���", "ȭ��Ʈ", 2300);
		
		
	
	}
	

}

package dreamschool.cscourse.chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		Chocolate[] chocos = new Chocolate[3];
		chocos[0] = new Chocolate("�Ƹ�����" , "��ũ" , 2200);
		chocos[1] = new Chocolate("ī�� �⸮��", "��ũ" , 2500);
		chocos[2] = new Chocolate("Ʈ���� ���" , "ȭ��Ʈ" , 2300);
		
		int sum = 0;
		
		for(int i = 0 ; i < chocos.length ; i++ ) {
			chocos[i].printChocolateInfo();
			if(chocos[i].getType().equals("ȭ��Ʈ")) {
				sum += chocos[i].getPrice() * 80 / 100;
			}else {
				sum += chocos[i].getPrice();
			
						
			}
		}
		System.out.println("�ϳ��� �������� �� �� ���� : " + sum);

	}

}

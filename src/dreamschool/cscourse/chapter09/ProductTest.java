package dreamschool.cscourse.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product laundry = new Product("�뵹��" , 450000 , 8) ;
		Television cinema = new Television ("�ó׸� TV" , 350000 , 10 , "ȭ�� ũ�� 151cm") ;
		
		laundry.pringProductInfo();
		System.out.println();
	    cinema.pringProductInfo();
	    System.out.println("��� : " + cinema.getDescription());
	    
	    System.out.println();
	    System.out.println("[����] �������� ��� 15%�� �����մϴ�.");
	    laundry.setDiscountRate(15);
	    cinema.setDiscountRate(15);
	    
	    System.out.println(laundry.getName() + "�ǸŰ� : " + laundry.cacluateDiscountPrice() + "��");
	    System.out.println(cinema.getName() + "�ǸŰ� : " + cinema.cacluateDiscountPrice() + "��");
	    
	    
		
		

	}

}

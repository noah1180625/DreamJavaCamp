package dreamschool.cscourse.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television infinia = new Television ("INFINIA" , 1500000);
		Television xcanvas = new Television ("XCANVAS" , 1000000 , "LCDTV");
		Television cinema = new Television ("CINEMA" , 2000000 , "LCDTV");
		
		infinia.printTelevisionInfo();
		xcanvas.printTelevisionInfo();
		cinema.printTelevisionInfo();
		
		System.out.println("������ �� : " +(infinia.price + xcanvas.price + cinema.price));

	}

}

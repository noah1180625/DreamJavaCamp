package dreamschool.cscourse.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String department = "������";
		String mathScore = "86";
		int intMathScore = Integer.parseInt(mathScore)+1;
		
	    System.out.println(name);
		System.out.println(department);
		
		System.out.println(name + department);
		System.out.println(name + " : "+department);
		System.out.println("�������� :"+mathScore);
		System.out.println("�������� :"+ intMathScore);

	}

}
